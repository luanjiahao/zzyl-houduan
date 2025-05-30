package com.zzyl.serve.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzyl.serve.domain.NursingPlan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 护理计划Mapper接口
 *
 * @author ruoyi
 * @date 2025-05-30
 */
@Mapper
public interface NursingPlanMapper extends BaseMapper<NursingPlan> {
    /**
     * 查询护理计划
     *
     * @param id 护理计划主键
     * @return 护理计划
     */
    public NursingPlan selectNursingPlanById(Integer id);

    /**
     * 查询护理计划列表
     *
     * @param nursingPlan 护理计划
     * @return 护理计划集合
     */
    public List<NursingPlan> selectNursingPlanList(NursingPlan nursingPlan);

    /**
     * 新增护理计划
     *
     * @param nursingPlan 护理计划
     * @return 结果
     */
    public int insertNursingPlan(NursingPlan nursingPlan);

    /**
     * 修改护理计划
     *
     * @param nursingPlan 护理计划
     * @return 结果
     */
    public int updateNursingPlan(NursingPlan nursingPlan);

    /**
     * 删除护理计划
     *
     * @param id 护理计划主键
     * @return 结果
     */
    public int deleteNursingPlanById(Integer id);

    /**
     * 批量删除护理计划
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNursingPlanByIds(Integer[] ids);
}
