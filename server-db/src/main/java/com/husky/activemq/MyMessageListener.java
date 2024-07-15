package com.husky.activemq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/7/15 14:15
 */
public class MyMessageListener implements MessageListener {

    public void onMessage(Message message) {
        if(message instanceof TextMessage){
            TextMessage tm = (TextMessage) message;
            try {
                System.out.println("接收到的信息是："+tm.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }

}
