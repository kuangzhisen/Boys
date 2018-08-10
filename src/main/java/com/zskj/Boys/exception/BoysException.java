package com.zskj.Boys.exception;

public class BoysException extends  RuntimeException{

    private  Integer code;

    public BoysException(String message, Integer code) {
        super(message);
        this.code = code;
    }



    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
