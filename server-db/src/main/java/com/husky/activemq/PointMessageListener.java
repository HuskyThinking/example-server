package com.husky.activemq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/7/15 13:59
 */
public class PointMessageListener implements MessageListener {
    public void onMessage(Message message) {
        if(message instanceof TextMessage){
            TextMessage msg = (TextMessage) message;
            try {
                System.out.println("receive message : "+msg.getText());
                // 表明进行手动的信息签收
                message.acknowledge();
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }

}
