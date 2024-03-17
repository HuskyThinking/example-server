package com.huksy.thread.juc;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/17 22:25
 */
public class InterruptedTest {

    public static Boolean flag = true;

    public static void main(String[] args) throws InterruptedException {



        Thread thread1 = new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("线程中断");
                e.printStackTrace();
            }
        });

//        thread1.start();
//        thread1.interrupt();

        Thread thread2 = new Thread(() -> {
            while(flag) {
                if (Thread.interrupted()) {
                    System.out.println("11");
                } else {
                    System.out.println("线程中断之后正常运行");
                }
            }
        });

        thread2.start();
        thread2.interrupt();
        Thread.sleep(1);
        flag = false;
    }

}
