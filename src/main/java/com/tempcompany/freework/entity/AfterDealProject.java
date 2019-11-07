package com.tempcompany.freework.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
    private Integer projectId;

    /**
     * 结算后价格
     */
    private BigDecimal afterPayoff;

    /**
     * 接单人id
     */
    private Integer userId;

    /**
     * 合同文件路径
     */
    private String contractFile;

    /**
     * 创建时间
     */
    private Date createTime;



}
