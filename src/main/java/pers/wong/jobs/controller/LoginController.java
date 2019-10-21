package pers.wong.jobs.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.wong.jobs.request.LoginRequest;
import pers.wong.jobs.service.LoginService;
import pers.wong.jobs.util.Result;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
@Api(tags = "用户登录相关操作")
public class LoginController {
    @Resource
    private LoginService loginService;

    @PostMapping("login")
    @ApiOperation("登录")
    public Result login(@RequestBody LoginRequest request) {
        return loginService.login(request);
    }

    @GetMapping("logout")
    @ApiOperation("注销")
    public Result logout() {
        return loginService.logout();
    }
}
