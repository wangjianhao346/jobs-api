package pers.wong.jobs.util;

import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.springframework.stereotype.Component;
import pers.wong.jobs.dao.ExtendRoleMapper;

import javax.annotation.Resource;
import java.util.List;

@Component
public class PermissionUtil {
    @Resource
    private ExtendRoleMapper extendRoleMapper;

    public SimpleAuthorizationInfo setPermissions(SimpleAuthorizationInfo info, Integer permissionLevel) {
        List<String> list = extendRoleMapper.getRoleOnLevel(permissionLevel);
        info.addStringPermissions(list);
        return info;
    }
}
