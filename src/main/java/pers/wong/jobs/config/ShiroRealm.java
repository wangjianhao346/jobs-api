package pers.wong.jobs.config;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pers.wong.jobs.constant.IsDeleted;
import pers.wong.jobs.dao.ExtendRoleMapper;
import pers.wong.jobs.dao.RoleMapper;
import pers.wong.jobs.dao.UserMapper;
import pers.wong.jobs.entity.Role;
import pers.wong.jobs.entity.RoleExample;
import pers.wong.jobs.entity.User;
import pers.wong.jobs.entity.UserExample;
import pers.wong.jobs.service.UserService;
import pers.wong.jobs.util.PermissionUtil;

import javax.annotation.Resource;
import java.util.List;


public class ShiroRealm extends AuthorizingRealm {

    private static Logger logger = LoggerFactory.getLogger(ShiroRealm.class);

    @Resource
    private UserService userService;
    @Resource
    private UserMapper userMapper;
    @Resource
    private ExtendRoleMapper extendRoleMapper;
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private PermissionUtil permissionUtil;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.info("执行授权逻辑");
        // 给资源进行授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        UsernamePasswordToken token = (UsernamePasswordToken) principals.getPrimaryPrincipal();
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(token.getUsername())
                .andIsDeletedEqualTo(IsDeleted.N);
        List<User> userList = userMapper.selectByExample(example);
        if (!userList.isEmpty()) {
            User currentUser = userList.get(0);
            List<String> roles = extendRoleMapper.getRoleList(currentUser.getPid());
            if (!roles.isEmpty()) {
                RoleExample roleExample = new RoleExample();
                roleExample.createCriteria().andRoleEqualTo(roles.get(0));
                Role role = roleMapper.selectByExample(roleExample).get(0);
                permissionUtil.setPermissions(info, role.getLevel());
            }
        }
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        logger.info("执行认证逻辑");

        UsernamePasswordToken user = (UsernamePasswordToken) token;
        User currentUser = userService.getUserByName(user.getUsername());

        // 判断用户名
        if (currentUser == null) {
            throw new UnknownAccountException();
        }
        // 判断密码
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user, user.getPassword(), getName());
        // 当验证都通过后，把用户信息放在session里
        Session session = SecurityUtils.getSubject().getSession();
        session.setAttribute(session.getId(), user);
        return authenticationInfo;
    }
}
