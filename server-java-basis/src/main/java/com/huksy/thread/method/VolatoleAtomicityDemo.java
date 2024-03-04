package com.huksy.thread.method;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/4 16:05
 */
public class VolatoleAtomicityDemo {

//    public volatile static int inc = 0;

    public static AtomicInteger inc = new AtomicInteger();

    public void increase() {
        inc.getAndIncrement();
    }


//    public void increase() {
//        inc++;
//    }



    /**
     * @description: 使用 synchronized 改进
     * @param:
     * @return: void
     */
//    public synchronized void increase() {
//        inc++;
//    }


    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        VolatoleAtomicityDemo volatoleAtomicityDemo = new VolatoleAtomicityDemo();
        for (int i = 0; i < 10; i++) {
            threadPool.execute(() -> {
                for (int j = 0; j < 500; j++) {
                    volatoleAtomicityDemo.increase();
                }
            });
        }
        // 等待1.5秒，保证上面程序执行完成
        Thread.sleep(1500);
        System.out.println(inc.get());
        threadPool.shutdown();
    }

}
