package com.example.selenium.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

    /**
     * Advice that logs methods throwing exceptions.
     */
    @AfterThrowing(pointcut = "com.example.selenium.aop.PointCuts.stepDefinitionsPointcut()", throwing = "e")
    public void logAfterThrowing(JoinPoint joinPoint, Throwable e) {

        log.error("Exception in {}.{}(), Message:'{}'  with cause = {}",
            joinPoint.getSignature().getDeclaringTypeName(),
            joinPoint.getSignature().getName(), e.getMessage(),
            e.getCause() != null ? e.getCause() : "NULL");
    }
}
