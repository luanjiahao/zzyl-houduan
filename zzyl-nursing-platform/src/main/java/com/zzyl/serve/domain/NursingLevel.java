package com.zzyl.serve.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.zzyl.common.annotation.Excel;
import com.zzyl.common.core.domain.BaseEntity;

/**
 * 护理等级对象 nursing_level
 *
 * @author ruoyi
 * @date 2025-05-30
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("护理等级实体")
public class NursingLevel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    @ApiModelProperty("主键ID")
    private Integer id;

    /** 等级名称 */
    @Excel(name = "等级名称")
    @ApiModelProperty("等级名称")
    private String name;

    /** 护理计划ID */
    @Excel(name = "护理计划ID")
    @ApiModelProperty("护理计划ID")
    private Integer lplanId;

    /** 护理费用 */
    @Excel(name = "护理费用")
    @ApiModelProperty("护理费用")
    private Double fee;

    /** 状态（0：禁用，1：启用） */
    @Excel(name = "状态", readConverterExp = "0=：禁用，1：启用")
    @ApiModelProperty("状态（0：禁用，1：启用）")
    private Integer status;

    /** 等级说明 */
    @Excel(name = "等级说明")
    @ApiModelProperty("等级说明")
    private String description;


}
