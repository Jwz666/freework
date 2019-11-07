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
    private String projectName;

    /**
     * 项目金额
     */
    private BigDecimal projectPayoff;

    /**
     * 项目描述
     */
    private String projectDecrible;

    /**
     * 相关文件路径
     */
    private String projectFile;

    /**
     * 项目状态：0、待审核 1、已审核 2、已分配
     */
    private Integer projectStatus;

    /**
     * 项目发布用户id
     */
    private Integer userId;

    /**
     * 项目创建时间
     */
    private Date createTime;

    /**
     * 合同文件路径
     */
    private String contractFile;



}
