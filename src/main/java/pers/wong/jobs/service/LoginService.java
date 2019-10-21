package pers.wong.jobs.service;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pers.wong.jobs.convert.UserConverter;
import pers.wong.jobs.dto.UserDTO;
import pers.wong.jobs.request.LoginRequest;
import pers.wong.jobs.util.Result;

import javax.annotation.Resource;

@Service
public class LoginService {
    private static Logger logger = LoggerFactory.getLogger(LoginService.class);

    @Resource
    private UserService userService;

    public Result<UserDTO> login(LoginRequest request) {
        Result<UserDTO> result = new Result<>();
        result.setSuccessful(false);
        result.setMessage("用户名不能为空");
        if (null == request.getUsername())
            return result;

        /* 编写用户认证操作 */

        // 1、获取Subject
        Subject subject = SecurityUtils.getSubject();

        // 2、封装用户数据
        UsernamePasswordToken token = new UsernamePasswordToken(request.getUsername(), request.getPassword());

        try {
            // 3、执行登录方法
            subject.login(token);
        } catch (UnknownAccountException uae) {
            result.setMessage("未知账户");
        } catch (IncorrectCredentialsException ice) {
            result.setMessage("密码不正确");
        } catch (LockedAccountException lae) {
            result.setMessage("账户已锁定");
        } catch (ExcessiveAttemptsException eae) {
            result.setMessage("用户名或密码错误次数过多");
        } catch (AuthenticationException ae) {
            result.setMessage("用户名或密码不正确");
        }
        // 验证是否登录成功
        if (subject.isAuthenticated()) {
            result.setSuccessful(true);
            result.setMessage("登录成功");
            logger.info("登录成功");
            UserDTO dto = UserConverter.convert(userService.getUserByName(request.getUsername()));
            dto.setSessionId(SecurityUtils.getSubject().getSession().getId().toString());
            result.setData(dto);
        } else {
            token.clear();
            logger.info("重新登录");
        }
        return result;
    }

    public Result logout() {
        Result result = new Result<>();
        result.setSuccessful(true);
        try {
            Subject subject = SecurityUtils.getSubject();
            subject.logout();
        } catch (Exception e) {
            result.setSuccessful(false);
            result.setMessage("注销失败");
        }
        return result;
    }
}
