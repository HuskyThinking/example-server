package com.huksy.design.factory;

/**
 * @author Axin
 * @version 1.0
 * @description: 简单方法工厂模式
 * @date 2024/3/6 21:03
 */
public class SimpleFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("请输入正确的类型!");
            return null;
        }
    }
}
