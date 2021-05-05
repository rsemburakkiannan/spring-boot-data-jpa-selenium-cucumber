package com.example.selenium.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointCuts {

    /**
     * Method is empty as this is just a Pointcut, the implementations are in the advices.
     */
    @Pointcut("within(com.example.selenium.steps..*)")
    public void stepDefinitionsPointcut() {

    }
}
