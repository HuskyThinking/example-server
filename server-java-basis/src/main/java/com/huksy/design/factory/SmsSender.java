package com.huksy.design.factory;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/6 21:02
 */
public class SmsSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is smsSender!");
    }
}
