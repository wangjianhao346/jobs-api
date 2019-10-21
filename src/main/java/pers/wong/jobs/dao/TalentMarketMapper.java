package pers.wong.jobs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.wong.jobs.entity.TalentMarket;
import pers.wong.jobs.entity.TalentMarketExample;

public interface TalentMarketMapper {
    long countByExample(TalentMarketExample example);

    int deleteByExample(TalentMarketExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(TalentMarket record);

    int insertSelective(TalentMarket record);

    List<TalentMarket> selectByExample(TalentMarketExample example);

    TalentMarket selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") TalentMarket record, @Param("example") TalentMarketExample example);

    int updateByExample(@Param("record") TalentMarket record, @Param("example") TalentMarketExample example);

    int updateByPrimaryKeySelective(TalentMarket record);

    int updateByPrimaryKey(TalentMarket record);
}