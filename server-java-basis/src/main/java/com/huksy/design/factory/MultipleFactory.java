package com.huksy.design.factory;

/**
 * @author Axin
 * @version 1.0
 * @description: 多个方法工厂模式
 * @date 2024/3/6 21:06
 */
public class MultipleFactory {

    public MailSender produceMail(){
        return new MailSender();
    }

    public SmsSender produceSms(){
        return new SmsSender();
    }

}
