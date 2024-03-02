package com.huksy.thread.juc.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @author Axin
 * @version 1.0
 * @description: 两个静态同步方法，2部手机，请问先打印邮件还是短信？
 * @date 2024/3/2 18:41
 */
public class Lock6 {

    public static void main(String[] args) throws InterruptedException {
        /*被synchronized和static修饰的方法，锁的对象是类的class对象。因为两个同步方法都被static修
        饰了，即便用了两个不同的对象调用方法，两个方法用的还是同一个锁，后调用的方法需要等待先调用
        的方法。*/
        Phone6 phone = new Phone6();
        Phone6 phone2 = new Phone6();
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


class Phone6{
    public static synchronized void sendEmail() throws Exception{
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sendEmail");
    }
    public static synchronized void sendSMS() throws Exception{
        System.out.println("sendSMS");
    }
}