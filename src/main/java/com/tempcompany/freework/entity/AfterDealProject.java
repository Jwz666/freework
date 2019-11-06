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
public class AfterDealProject extends Model<AfterDealProject> {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 原项目id
     */
    private Integer project_id;

    /**
     * 结算后价格
     */
    private BigDecimal after_payoff;

    /**
     * 接单人id
     */
    private Integer user_id;

    /**
     * 合同文件路径
     */
    private String contract_file;

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

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public BigDecimal getAfter_payoff() {
        return after_payoff;
    }

    public void setAfter_payoff(BigDecimal after_payoff) {
        this.after_payoff = after_payoff;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getContract_file() {
        return contract_file;
    }

    public void setContract_file(String contract_file) {
        this.contract_file = contract_file;
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
        return "AfterDealProject{" +
        "id=" + id +
        ", project_id=" + project_id +
        ", after_payoff=" + after_payoff +
        ", user_id=" + user_id +
        ", contract_file=" + contract_file +
        ", create_time=" + create_time +
        "}";
    }
}
