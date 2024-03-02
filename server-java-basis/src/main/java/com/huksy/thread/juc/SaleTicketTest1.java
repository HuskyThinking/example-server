package com.huksy.thread.juc;

/**
 * @author Axin
 * @version 1.0
 * @description: 三个售票员 卖出 30张票  1. 在高内聚低耦合的前提下， 线程 操作(对外暴露的调用方法) 资源类
 * @date 2024/3/2 17:56
 */
public class SaleTicketTest1 {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
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

/**
 * @author Axin
 * @version 1.0
 * @description: 资源类
 * @date 2024/3/2 17:57
 */
class Ticket {
    private int number = 30;

    public synchronized void saleTicket() {
        if (number > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出第 " +
                    (number--) + "票,还剩下:" + number);
        }
    }
}