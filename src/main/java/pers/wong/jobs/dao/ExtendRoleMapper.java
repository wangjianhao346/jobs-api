package pers.wong.jobs.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ExtendRoleMapper {

    @Select({
            "select role",
            "from job_user_role ur",
            "    left join job_role r on ur.role_id = r.pid",
            "where ur.user_id = #{userId}"
    })
    List<String> getRoleList(@Param("userId") Integer userId);

    @Select({
            "select role from job_role where level >= #{level}"
    })
    List<String> getRoleOnLevel(@Param("level") Integer level);
}
