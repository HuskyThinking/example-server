package com.huksy.thread.juc.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @author Axin
 * @version 1.0
 * @description: 邮件方法暂停4秒钟，请问先打印邮件还是短信？
 * @date 2024/3/2 18:10
 */
public class Lock2 {

    public static void main(String[] args) {
        /*被synchronized修饰的方法，锁的对象是方法的调用者。因为两个方法的调用者是同一个，所以
        两个方法用的是同一个锁，先调用方法的先执行，第二个方法只有在第一个方法执行完释放锁之后才能
        执行。*/
        Phone2 phone = new Phone2();
        new Thread(() -> {
            try {
                phone.sendEmail();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "A").start();
        new Thread(() -> {
            try {
                phone.sendSMS();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "B").start();
    }

}

class Phone2 {
    public synchronized void sendEmail() throws Exception {
        try {
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("sendEmail");
    }

    public synchronized void sendSMS() throws Exception {
        System.out.println("sendSMS");
    }
}