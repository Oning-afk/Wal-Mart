package com.walmart.exception;

/**
 * @program: Wal-Mart
 * @description: 错误整合
 * @author: 邓希凡
 * @create: 2019-09-17 21:44
 **/
public class CustomException extends Exception {

    private String message;

    public CustomException(String message){
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
