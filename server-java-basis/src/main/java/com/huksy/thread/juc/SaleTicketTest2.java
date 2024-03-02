package com.huksy.thread.juc;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/2 17:59
 */
public class SaleTicketTest2 {

    public static void main(String[] args) {
        TicketTwo ticket = new TicketTwo();
        new Thread(() -> {
            for (int i = 1; i <= 40; i++) {
                ticket.saleTicket();
            }
        }, "A").start();
        new Thread(() -> {
            for (int i = 1; i <= 40; i++) {
                ticket.saleTicket();
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 1; i <= 40; i++) {
                ticket.saleTicket();
            }
        }, "C").start();
    }

}

class TicketTwo {
    private int number = 30;
    private final ReentrantLock lock = new ReentrantLock();

    public void saleTicket() {
        lock.lock();
        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + "卖出第 " +
                        (number--) + "票,还剩下:" + number);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}