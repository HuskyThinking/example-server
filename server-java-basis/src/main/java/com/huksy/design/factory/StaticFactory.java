package com.huksy.design.factory;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/6 21:08
 */
public class StaticFactory {

    public static MailSender produceMail(){
        return new MailSender();
    }

    public static SmsSender produceSms(){
        return new SmsSender();
    }

}
