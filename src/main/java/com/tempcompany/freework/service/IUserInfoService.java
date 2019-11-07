package com.tempcompany.freework.service;

import com.tempcompany.freework.component.RetData;
import com.tempcompany.freework.entity.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jwz
 * @since 2019-11-04
 */
public interface IUserInfoService extends IService<UserInfo> {

    /**
     * 登录
     * @param code
     * @return
     */
    RetData login(String code);

    /**
     * 完善用户信息
     * @param userInfo
     * @return
     */
    RetData ImproveUserInfo(UserInfo userInfo);
}
