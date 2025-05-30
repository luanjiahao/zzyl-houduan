package com.zzyl.serve.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import com.zzyl.serve.domain.NursingProject;

/**
 * 护理项目Mapper接口
 *
 * @author ruoyi
 * @date 2025-05-30
 */
@Mapper
public interface NursingProjectMapper extends BaseMapper<NursingProject>
{
    /**
     * 查询护理项目
     *
     * @param id 护理项目主键
     * @return 护理项目
     */
    public NursingProject selectNursingProjectById(Long id);

    /**
     * 查询护理项目列表
     *
     * @param nursingProject 护理项目
     * @return 护理项目集合
     */
    public List<NursingProject> selectNursingProjectList(NursingProject nursingProject);

    /**
     * 新增护理项目
     *
     * @param nursingProject 护理项目
     * @return 结果
     */
    public int insertNursingProject(NursingProject nursingProject);

    /**
     * 修改护理项目
     *
     * @param nursingProject 护理项目
     * @return 结果
     */
    public int updateNursingProject(NursingProject nursingProject);

    /**
     * 删除护理项目
     *
     * @param id 护理项目主键
     * @return 结果
     */
    public int deleteNursingProjectById(Long id);

    /**
     * 批量删除护理项目
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNursingProjectByIds(Long[] ids);
}
