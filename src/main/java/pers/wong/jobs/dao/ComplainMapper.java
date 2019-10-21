package pers.wong.jobs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.wong.jobs.entity.Complain;
import pers.wong.jobs.entity.ComplainExample;

public interface ComplainMapper {
    long countByExample(ComplainExample example);

    int deleteByExample(ComplainExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Complain record);

    int insertSelective(Complain record);

    List<Complain> selectByExampleWithBLOBs(ComplainExample example);

    List<Complain> selectByExample(ComplainExample example);

    Complain selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Complain record, @Param("example") ComplainExample example);

    int updateByExampleWithBLOBs(@Param("record") Complain record, @Param("example") ComplainExample example);

    int updateByExample(@Param("record") Complain record, @Param("example") ComplainExample example);

    int updateByPrimaryKeySelective(Complain record);

    int updateByPrimaryKeyWithBLOBs(Complain record);

    int updateByPrimaryKey(Complain record);
}