package com.tempcompany.freework.entity;

import java.math.BigDecimal;
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
public class OriginalProject extends Model<OriginalProject> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 项目名称
     */
    private String project_name;

    /**
     * 项目金额
     */
    private BigDecimal project_payoff;

    /**
     * 项目描述
     */
    private String project_decrible;

    /**
     * 相关文件路径
     */
    private String project_file;

    /**
     * 项目状态：0、待审核 1、已审核 2、已分配
     */
    private Integer project_status;

    /**
     * 项目发布用户id
     */
    private Integer user_id;

    /**
     * 项目创建时间
     */
    private LocalDateTime create_time;

    /**
     * 合同文件路径
     */
    private String contract_file;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public BigDecimal getProject_payoff() {
        return project_payoff;
    }

    public void setProject_payoff(BigDecimal project_payoff) {
        this.project_payoff = project_payoff;
    }

    public String getProject_decrible() {
        return project_decrible;
    }

    public void setProject_decrible(String project_decrible) {
        this.project_decrible = project_decrible;
    }

    public String getProject_file() {
        return project_file;
    }

    public void setProject_file(String project_file) {
        this.project_file = project_file;
    }

    public Integer getProject_status() {
        return project_status;
    }

    public void setProject_status(Integer project_status) {
        this.project_status = project_status;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public LocalDateTime getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time) {
        this.create_time = create_time;
    }

    public String getContract_file() {
        return contract_file;
    }

    public void setContract_file(String contract_file) {
        this.contract_file = contract_file;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "OriginalProject{" +
        "id=" + id +
        ", project_name=" + project_name +
        ", project_payoff=" + project_payoff +
        ", project_decrible=" + project_decrible +
        ", project_file=" + project_file +
        ", project_status=" + project_status +
        ", user_id=" + user_id +
        ", create_time=" + create_time +
        ", contract_file=" + contract_file +
        "}";
    }
}
