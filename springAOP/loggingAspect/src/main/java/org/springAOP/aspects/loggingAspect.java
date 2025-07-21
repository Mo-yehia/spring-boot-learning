package org.springAOP.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Aspect
@Component
public class loggingAspect {
    private final Logger logger =
            Logger.getLogger(loggingAspect.class.getName());

    @Before("execution(* org.springAOP.services.*.*(..))")
    public void logBefore() {
        logger.info("@Before Advice ==> Before method ");
    }
    @Around("execution(* org.springAOP.services.*.*(..))")
    public Object logAround(ProceedingJoinPoint joinPoint)throws Throwable{
        logger.info("@Around Advice ==> Before method ");

        Object result = joinPoint.proceed();

        logger.info("@Around Advice ==> After method ");

        return result;
    }

    @After("execution(* org.springAOP.services.*.*(..))")
    public void logAfter() {
        logger.info("@After Advice ==> After method ");
    }
}