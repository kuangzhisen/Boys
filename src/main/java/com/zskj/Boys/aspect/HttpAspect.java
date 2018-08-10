package com.zskj.Boys.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class HttpAspect {

    private final static org.slf4j.Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.zskj.Boys.controller.BoysController.*(..))")
    public void log() {
    }

    @After("log()")
    public void gerTime(){
        System.out.println("今天是20180810");
        logger.info("今天是20180810+logger");
    }
}
