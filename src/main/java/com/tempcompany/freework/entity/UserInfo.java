package com.tempcompany.freework.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jwz
 * @since 2019-11-04
 */
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
     * 性别：1、男 2、女
     */
    private Integer sex;

    /**
     * 用户头像
     */
    private String user_profile;

    /**
     * 用户联系方式
     */
    private String phone;

    /**
     * 用户真实姓名
     */
    private String real_name;

    /**
     * 身份证号
     */
    private String id_card;

    /**
     * 通讯地址
     */
    private String address;

    /**
     * 用户状态：1、已认证 2、未认证
     */
    private String user_status;

    /**
     * 用户简历
     */
    private String user_resume;

    /**
     * 用户简历文件
     */
    private String user_resume_file;

    /**
     * 创建时间
     */
    private LocalDateTime create_time;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getUser_profile() {
        return user_profile;
    }

    public void setUser_profile(String user_profile) {
        this.user_profile = user_profile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getId_card() {
        return id_card;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public String getUser_resume() {
        return user_resume;
    }

    public void setUser_resume(String user_resume) {
        this.user_resume = user_resume;
    }

    public String getUser_resume_file() {
        return user_resume_file;
    }

    public void setUser_resume_file(String user_resume_file) {
        this.user_resume_file = user_resume_file;
    }

    public LocalDateTime getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time) {
        this.create_time = create_time;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
        "id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", openid=" + openid +
        ", sex=" + sex +
        ", user_profile=" + user_profile +
        ", phone=" + phone +
        ", real_name=" + real_name +
        ", id_card=" + id_card +
        ", address=" + address +
        ", user_status=" + user_status +
        ", user_resume=" + user_resume +
        ", user_resume_file=" + user_resume_file +
        ", create_time=" + create_time +
        "}";
    }
}
