package com.imufe.ws.service;



import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



//@Component
//@Aspect
public class AspectLearn {
    private Logger logger=Logger.getLogger(AspectLearn.class);
    
    
    //@Before("execution(* com.imufe.ws.service.*.*(..))")
    public void myBefore(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName());
        System.out.println("日志，数据库已连接");
        logger.debug("日志");
    }
}
