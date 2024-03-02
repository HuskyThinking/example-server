package com.huksy.thread.juc.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @author Axin
 * @version 1.0
 * @description: 一个普通同步方法，一个静态同步方法，同一部手机，请问先打印邮件还是短信？
 * @date 2024/3/2 18:44
 */
public class Lock7 {

    public static void main(String[] args) throws InterruptedException {
        /*被synchronized和static修饰的方法，锁的对象是类的class对象。仅仅被synchronized修饰的方
        法，锁的对象是方法的调用者。因为两个方法锁的对象不是同一个，所以两个方法用的不是同一个锁，
        后调用的方法不需要等待先调用的方法。*/
        Phone7 phone = new Phone7();
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
                phone.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "B").start();
    }

}

class Phone7{
    public static synchronized void sendEmail() throws Exception{
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