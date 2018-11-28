package com.liusir.mcms.base.aop;

import com.liusir.mcms.base.bean.ResultBean;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018-11-28.
 */
@Aspect
@Configuration
public class ControllerAOP {

    private static final Logger logger = LoggerFactory.getLogger(ControllerAOP.class);

    @Pointcut("execution(public com.liusir.mcms.base.bean.ResultBean *(..))")
    public void executeService(){}

    @Around("executeService()")
    public Object handlerControllerMethod(ProceedingJoinPoint pjp){
        long startTime = System.currentTimeMillis();
        ResultBean<?> result;

        try {
            result = ( ResultBean<?>) pjp.proceed();
            logger.info(pjp.getSignature() + "use time:" + (System.currentTimeMillis() - startTime));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            result = handlerException(pjp, throwable);
        }

        return result;
    }

    private ResultBean<?> handlerException(ProceedingJoinPoint pjp, Throwable e){

        ResultBean<?> result = new ResultBean();

        // 已知异常
        if (e instanceof Exception) {
            result.setMsg(e.getLocalizedMessage());
            result.setCode(ResultBean.FAIL);
        } else {
            logger.error(pjp.getSignature() + " error ", e);
            //TODO 未知的异常，应该格外注意，可以发送邮件通知等
            result.setMsg(e.toString());
            result.setCode(ResultBean.FAIL);
        }

        return result;
    }

}
