package com.sdkserver.auth.intercept;

import com.sdkserver.common.result.Result;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


/**
 * @Author Eric Chan
 * @Description 获取全局错误,包括部分参数校验错误
 * @Date 2018/9/17 18:37
 * @CLASS GlobalExceptionHandler
 */
@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    //@ResponseStatus(HttpStatus.BAD_REQUEST) //设置返回response状态
    public Result constraintViolationHandle(ConstraintViolationException exception) {
            //1 如果该错误为参数[@RequestParam,@PathVariable]校验的错误，则返回错误信息
            Set<ConstraintViolation<?>> violations = exception.getConstraintViolations();
            //2 获取全部错误信息
            List strs = new ArrayList();
            for (ConstraintViolation<?> item : violations) {
                strs.add(item.getMessage());
            }
            //3 返回
            return Result.binding(StringUtils.join(strs,"，"));
    }

    //开发阶段可以不开启
    //@ExceptionHandler(Exception.class)
    @ResponseBody
    //@ResponseStatus(HttpStatus.BAD_REQUEST) //设置返回response状态
    public Result exceptionHandle() {

        //返回统一系统错误
          return Result.error();
         }

}
