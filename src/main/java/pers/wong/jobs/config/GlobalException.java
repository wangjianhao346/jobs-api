package pers.wong.jobs.config;


import org.apache.shiro.authz.UnauthenticatedException;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.wong.jobs.constant.ErrorCode;
import pers.wong.jobs.util.ResultBuilder;


@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Object errorHandler(Exception e) {
        if (e instanceof BusinessException) {
            BusinessException businessException = (BusinessException) e;
            return ResultBuilder.error(businessException.getCode(), businessException.getMessage());
        } else if (e instanceof UnauthenticatedException) {     // shiro 异常：未登录
            return ResultBuilder.error(ErrorCode.LOGIN_ERROR);
        } else if (e instanceof UnauthorizedException) {        // shiro 异常：未授权
            return ResultBuilder.error(ErrorCode.LIMIT_USER);
        }
        // 未知错误
        return ResultBuilder.error(ErrorCode.SERVICE_ERROR);
    }
}
