package com.huksy.exception;

/**
 * @author Axin
 * @version 1.0
 * @description: 自定异常
 * @date 2024/3/3 19:50
 */
public class MyException extends RuntimeException{

    public MyException() {
        super();
        System.out.println("打印出错日志");
    }

    public MyException(String message) {
        super(message);
    }

}
