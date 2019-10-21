package pers.wong.jobs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.wong.jobs.entity.SeekerNotice;
import pers.wong.jobs.entity.SeekerNoticeExample;

public interface SeekerNoticeMapper {
    long countByExample(SeekerNoticeExample example);

    int deleteByExample(SeekerNoticeExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(SeekerNotice record);

    int insertSelective(SeekerNotice record);

    List<SeekerNotice> selectByExample(SeekerNoticeExample example);

    SeekerNotice selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") SeekerNotice record, @Param("example") SeekerNoticeExample example);

    int updateByExample(@Param("record") SeekerNotice record, @Param("example") SeekerNoticeExample example);

    int updateByPrimaryKeySelective(SeekerNotice record);

    int updateByPrimaryKey(SeekerNotice record);
}