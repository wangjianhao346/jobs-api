package pers.wong.jobs.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import pers.wong.jobs.entity.Test;
import pers.wong.jobs.service.TestService;
import pers.wong.jobs.util.Result;
import pers.wong.jobs.util.ResultBuilder;

import javax.annotation.Resource;

@Api(tags = "测试")
@RequestMapping("/")
@RestController
public class TestController {
    @Resource
    private TestService testService;

    @ApiOperation("测试")
    @RequiresAuthentication
//    @RequiresPermissions(value = {"11", "1"}, logical = Logical.OR)
    @PostMapping("test")
    public Result test(@RequestParam("file") MultipartFile file) {
        Test test = new Test();
        test.setTest(file.getName());
        return ResultBuilder.success(test);
    }

    @ApiOperation("权限测试")
    @PostMapping("test1")
    @RequiresAuthentication
    public Result test1(@RequestBody Test test) {
        return ResultBuilder.success(test);
    }
}
