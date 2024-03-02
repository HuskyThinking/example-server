package com.huksy.thread.create;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class NumberThread implements Runnable {
    @Override
    public void run() {
        //遍历100以内的偶数
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

class NumberThread1 implements Runnable {
    @Override
    public void run() {
        //遍历100以内的奇数
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
}

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/2 14:45
 */
public class ThreadPool {

    public static void main(String[] args) {
        // 1. 提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

        // 输出class java.util.concurrent.ThreadPoolExecutor
        System.out.println(service.getClass());

        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
//        自定义线程池的属性
//        service1.setCorePoolSize(15);
//        service1.setKeepAliveTime();

        // 2. 执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new NumberThread());//适用于Runnable
        service.execute(new NumberThread1());//适用于Runnable
//        service.submit(Callable callable);//适合使用于Callable

        // 3. 关闭连接池
        service.shutdown();
    }

}
