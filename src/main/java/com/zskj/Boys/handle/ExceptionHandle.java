package com.zskj.Boys.handle;

import com.zskj.Boys.entity.Result;
import com.zskj.Boys.exception.BoysException;
import com.zskj.Boys.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle  {

    private final static Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value= Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if (e instanceof BoysException){
            BoysException boysException = (BoysException)e;
            return ResultUtil.error(boysException.getCode(),boysException.getMessage());
        }else {
            return ResultUtil.error(-1,"未知错误");
        }

    }




}
