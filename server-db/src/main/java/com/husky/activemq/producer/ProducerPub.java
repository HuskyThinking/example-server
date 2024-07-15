package com.husky.activemq.producer;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

public class ProducerPub {

    public static final String URL = "failover:(tcp://39.99.81.240:61616)";

    public static final String QUEUE_NAME = "TEST_TOPIC_QUEUE";

    public static void main(String[] args) throws JMSException {
        // 创建connection工厂对象，需要传入用户名，密码以及BrokerURL（也就是ActiveMQ实例对应协议的访问路径）
        ConnectionFactory cf = new ActiveMQConnectionFactory("admin","123456",URL);
        Connection conn = null;
        Session session = null;
        MessageProducer producer = null;
        try{
            conn = cf.createConnection();
            // 创建session，第一个参数表示是否开启事务，第二个参数表示信息的接收模式
            session = conn.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
            // 创建队列，传入队列名称
            Topic topic = session.createTopic(QUEUE_NAME);
            producer = session.createProducer(topic);
            for (int i = 1; i <= 10 ; i++){
                TextMessage msg = session.createTextMessage("this is no " + i + " message");
                producer.send(msg);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(null != conn){
                conn.close();
            }
            if(null != session){
                session.close();
            }
            if(null != producer){
                session.close();
            }
        }

    }
}