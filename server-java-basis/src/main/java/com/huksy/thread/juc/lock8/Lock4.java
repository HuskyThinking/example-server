package com.huksy.thread.juc.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @author Axin
 * @version 1.0
 * @description: 两部手机、请问先打印邮件还是短信？
 * @date 2024/3/2 18:34
 */
public class Lock4 {

    public static void main(String[] args) throws InterruptedException {
        /*被synchronized修饰的方法，锁的对象是方法的调用者。因为用了两个对象调用各自的方法，所
        以两个方法的调用者不是同一个，所以两个方法用的不是同一个锁，后调用的方法不需要等待先调用的
        方法。*/
        Phone4 phone = new Phone4();
        Phone4 phone2 = new Phone4();
        new Thread(() -> {
            try {
                phone.sendEmail();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "A").start();

        Thread.sleep(200);

        new Thread(() -> {
            try {
                phone2.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "B").start();

    }

}

class Phone4{
    public synchronized void sendEmail() throws Exception{
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sendEmail");
    }
    public synchronized void sendSMS() throws Exception{
        System.out.println("sendSMS");
    }
}