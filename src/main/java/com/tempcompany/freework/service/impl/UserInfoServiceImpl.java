package com.tempcompany.freework.service.impl;

import com.tempcompany.freework.entity.UserInfo;
import com.tempcompany.freework.mapper.UserInfoMapper;
import com.tempcompany.freework.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
