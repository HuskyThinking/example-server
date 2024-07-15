package com.husky.activemq.consumer;

import com.husky.activemq.PointMessageListener;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class ConsumerP2P {
    public static final String URL = "failover:(tcp://39.99.81.240:61616)";

    public static final String QUEUE_NAME = "TEST_CUSTOMER_QUEUE";

    public static void main(String[] args)  {
        ConnectionFactory cf = new ActiveMQConnectionFactory("admin","123456",URL);
        Connection conn = null;
        Session session = null;
        MessageConsumer consumer = null;
        try {
            conn = cf.createConnection();
            conn.start();
            session = conn.createSession(Boolean.FALSE, Session.CLIENT_ACKNOWLEDGE);
            Queue queue = session.createQueue(QUEUE_NAME);
            consumer = session.createConsumer(queue);
            consumer.setMessageListener(new PointMessageListener());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}