package com.huksy.thread.juc.lock8;

import java.util.concurrent.TimeUnit;

/**
 * @author Axin
 * @version 1.0
 * @description: 新增一个普通方法hello()没有同步,请问先打印邮件还是hello？
 * @date 2024/3/2 18:13
 */
public class Lock3 {

    public static void main(String[] args) throws InterruptedException {
        /*新增的方法没有被synchronized修饰，不是同步方法，不受锁的影响，所以不需要等待。
        其他线程共用了一把锁，所以还需要等待。*/
        Phone3 phone = new Phone3();
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
//                phone.sendSMS();
                phone.hello();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "B").start();
    }

}

class Phone3 {
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

    public void hello() {
        System.out.println("Hello");
    }
}