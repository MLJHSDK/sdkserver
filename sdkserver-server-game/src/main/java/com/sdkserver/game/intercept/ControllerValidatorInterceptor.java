package com.sdkserver.game.intercept;

import com.sdkserver.common.result.Result;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

/**
 * @Author Eric Chan
 * @Description 利用切面统一处理【对象】中参数校验异常
 * @Date 2018/9/18 16:14
 * @CLASS ControllerValidatorInterceptor
 */
@Aspect
@Component
public class ControllerValidatorInterceptor {

    //需要拦截的包
    @Around("execution(* com.sdkserver.game.controller.*.*(..)) && args(..,bindingResult)")
    public Object doAround(ProceedingJoinPoint pjp, BindingResult bindingResult) throws Throwable {
        Object retVal;
        if (bindingResult.hasErrors()) {
            //如果校验失败，返回错误信息
            retVal = Result.binding(bindingResult.getFieldError().getDefaultMessage());
        } else {
            //继续运行
            retVal = pjp.proceed();
        }
        return retVal;
    }
}