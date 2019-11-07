package com.tempcompany.freework.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tempcompany.freework.component.RetData;
import com.tempcompany.freework.entity.UserInfo;
import com.tempcompany.freework.entity.WechatReturn;
import com.tempcompany.freework.mapper.UserInfoMapper;
import com.tempcompany.freework.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tempcompany.freework.service.WechatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jwz
 * @since 2019-11-04
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

    @Autowired
    private WechatService wechatService;
    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public RetData login(String code) {
        if(StringUtils.isEmpty(code)) {
            return new RetData().fail("501", "code为空");
        }
        WechatReturn wechatReturn = wechatService.getWechatUserInfo(code);
        UserInfo userInfo=new UserInfo();
        userInfo.setOpenid(wechatReturn.getOpenid());
        QueryWrapper<UserInfo> queryWrapper=new QueryWrapper<>();
        queryWrapper.setEntity(userInfo);
        UserInfo user = userInfoMapper.selectOne(queryWrapper);
        if(user==null) {
               user=new UserInfo();
               user.setOpenid(wechatReturn.getOpenid());
               user.setUserStatus("2");
               user.setCreateTime(new Date());
               userInfoMapper.insert(user);
        }

        return new RetData().success(user);
    }

    @Override
    public RetData ImproveUserInfo(UserInfo userInfo) {
        if(StringUtils.isEmpty(userInfo.getId())) {
            return new RetData().fail("501", "用户id为空");
        }

        userInfoMapper.updateById(userInfo);
        return new RetData().success(null);
    }
}
