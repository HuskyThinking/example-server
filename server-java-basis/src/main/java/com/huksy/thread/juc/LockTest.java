package com.huksy.thread.juc;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/17 21:48
 */
public class LockTest {

    private static int sum;

    public static void main(String[] args) throws InterruptedException {
        testInterruptLock();
    }

    public static void testInterruptLock() throws InterruptedException {
        // 可重入锁
        ReentrantLock lock = new ReentrantLock();

        Runnable target = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"开始抢占锁...");
                try {
                    lock.lockInterruptibly();
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName()+"抢占被中断，抢锁失败...");
                    e.printStackTrace();
                    return;
                }

                try{
                    System.out.println(Thread.currentThread().getName()+"抢到了锁，同步执行1秒");
                    // 线程处于阻塞状态
                    Thread.sleep(1000);
                    sum++;
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("同步被中断");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        };
        Thread t1 = new Thread(target,"thread-1");
        Thread t2 = new Thread(target,"thread-2");
        t1.start();
        t2.start();

        Thread.sleep(100);
        System.out.println("等待100ms,中断两个线程");
        // 中断两个线程
        t1.interrupt();
        t2.interrupt();

        Thread.sleep(Integer.MAX_VALUE);
    }

}
