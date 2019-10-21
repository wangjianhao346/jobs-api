package pers.wong.jobs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.wong.jobs.entity.Experience;
import pers.wong.jobs.entity.ExperienceExample;

public interface ExperienceMapper {
    long countByExample(ExperienceExample example);

    int deleteByExample(ExperienceExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Experience record);

    int insertSelective(Experience record);

    List<Experience> selectByExample(ExperienceExample example);

    Experience selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Experience record, @Param("example") ExperienceExample example);

    int updateByExample(@Param("record") Experience record, @Param("example") ExperienceExample example);

    int updateByPrimaryKeySelective(Experience record);

    int updateByPrimaryKey(Experience record);
}