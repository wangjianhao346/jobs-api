package pers.wong.jobs.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import pers.wong.jobs.util.ResultBuilder;

import javax.servlet.http.HttpServletRequest;

@Aspect
@Component
public class ServiceAspect {

    // service层的统计耗时切面，类型必须为final String类型的,注解里要使用的变量只能是静态常量类型的
    private static final String SERVICE_POINT = "execution (* pers.wong.jobs.service.*.*(..))";


    private Logger logger = LoggerFactory.getLogger(getClass());

    @Around(SERVICE_POINT)
    public Object ServiceAround(ProceedingJoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes != null ? attributes.getRequest() : null;
        String format = String.format("Origin:%s | Method:%s | RequestURL:%s | Query: %s |",
                request != null ? request.getHeader("Origin") : null, request != null ? request.getMethod() : null,
                request != null ? request.getRequestURL() : null, request != null ? request.getQueryString() : null);

        // 定义返回对象、得到方法需要的参数
        Object obj = null;
        Object[] args = joinPoint.getArgs();
        long startTime = System.currentTimeMillis();
        ResultBuilder.setStartTime(startTime);
        ResultBuilder.setSuccessful(false);
        // 获取执行的方法名
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        String methodName = signature.getDeclaringTypeName() + "." + signature.getName();
        try {
            obj = joinPoint.proceed(args);
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            e.getMessage();
            logger.error(methodName + e.getMessage());
        }
        logger.info(format);
        // 如果是对controller层的切面，此处需要修改
        ResultBuilder.setSuccessful(true);
        return obj;
    }

}
