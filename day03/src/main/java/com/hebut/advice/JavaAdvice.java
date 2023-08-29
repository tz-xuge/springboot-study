package com.hebut.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class JavaAdvice {

    @Before("execution(* com.hebut.service.impl.*.*(..))")
    public void start() {
        System.out.println("方法开始了");
    }

    @After("execution(* com.hebut.service.impl.*.*(..))")
    public void after() {
        System.out.println("方法结束了");
    }

}
