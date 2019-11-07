package com.tempcompany.freework.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author jwz
 * @since 2019-11-04
 */
@Data
public class UserInfo extends Model<UserInfo> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 微信openid
     */
    private String openid;

    /**
     * 微信code
     */
    @TableField(exist = false)
    private String code;

    /**
     * 性别：1、男 2、女
     */
    private Integer sex;

    /**
     * 用户头像
     */
    private String userProfile;

    /**
     * 用户联系方式
     */
    private String phone;

    /**
     * 用户真实姓名
     */
    private String realName;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 通讯地址
     */
    private String address;

    /**
     * 用户状态：1、已认证 2、未认证
     */
    private String userStatus;

    /**
     * 用户简历
     */
    private String userResume;

    /**
     * 用户简历文件
     */
    private String userResumeFile;

    /**
     * 创建时间
     */
    private Date createTime;




}
