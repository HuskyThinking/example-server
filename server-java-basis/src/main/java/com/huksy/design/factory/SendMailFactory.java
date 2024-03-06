package com.huksy.design.factory;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/6 21:15
 */
public class SendMailFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
