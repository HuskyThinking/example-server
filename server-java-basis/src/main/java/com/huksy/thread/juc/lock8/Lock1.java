package com.huksy.thread.juc.lock8;

/**
 * @author Axin
 * @version 1.0
 * @description: 标准访问，请问先打印邮件还是短信？
 * @date 2024/3/2 18:07
 */
public class Lock1 {
    public static void main(String[] args) {
//      被synchronized修饰的方法，锁的对象是方法的调用者。因为两个方法的调用者是同一个，所以两个方法用的是同一个锁，先调用方法的先执行。
        Phone phone = new Phone();
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

class Phone {
    public synchronized void sendEmail() throws Exception {
        System.out.println("sendEmail");
    }

    public synchronized void sendSMS() throws Exception {
        System.out.println("sendSMS");
    }
}