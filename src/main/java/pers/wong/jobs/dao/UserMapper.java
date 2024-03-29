package pers.wong.jobs.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.wong.jobs.entity.User;
import pers.wong.jobs.entity.UserExample;
import pers.wong.jobs.entity.UserKey;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(UserKey key);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(UserKey key);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}