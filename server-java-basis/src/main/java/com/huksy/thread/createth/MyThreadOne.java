package com.huksy.thread.createth;

/**
 * @author Axin
 * @version 1.0
 * @description: 1.创建一个继承于Thread类的子类
 * @date 2024/3/2 14:28
 */
public class MyThreadOne extends Thread{

    /**
     * @description: 2.重写Thread类的run()
     * @param:
     * @return: void
     * @author Axin
     */
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }

    public static void main(String[] args) {
        //3.创建Thread类的子类的对象
        MyThreadOne t1 = new MyThreadOne();

        //4.通过此对象调用start():①启动当前线程 ② 调用当前线程的run()
        t1.start();

        /*问题一：我们不能通过直接调用run()的方式启动线程，
        这种方式只是简单调用方法，并未新开线程*/
//        t1.run();

        /*问题二：再启动一个线程，遍历100以内的偶数。
        不可以还让已经start()的线程去执行。会报IllegalThreadStateException*/
//        t1.start();

        //重新创建一个线程的对象
        MyThreadOne t2 = new MyThreadOne();
        t2.start();

        //如下操作仍然是在main线程中执行的。
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i + "***********main()************");
            }
        }
    }
}
