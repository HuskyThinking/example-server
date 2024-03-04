package com.huksy.thread.pool;

import com.huksy.thread.create.ThreadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/4 16:45
 */
public class PoolExample {

    public static void main(String[] args) {

    /*
        参数
        int corePoolSize,   //线程池的核心线程数量，任务队列未达到队列容量时，最大可以同时运行的线程数量。
        int maximumPoolSize,    //线程池的最大线程数，任务队列中存放的任务达到队列容量的时候，当前可以同时运行的线程数量变为最大线程数。
        long keepAliveTime, // 当线程数大于核心线程数时，多余的空闲线程存活的最长时间
        TimeUnit unit,  // 时间单位
        BlockingQueue<Runnable>  workQueue,  //任务队列，用来储存等待执行任务的队列，
                 新任务来的时候会先判断当前运行的线程数量是否达到核心线程数，如果达到的话，新任务就会被存放在队列中。
        ThreadFactory threadFactory,    //线程工厂，用来创建线程，一般默认即可
        RejectedExecutionHandler  handler    //拒绝策略，当提交的任务过多而不能及时处理时，我们可以定制策略来处理任务
    */
        Integer coreSize = 8;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                coreSize, coreSize*2,5,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(coreSize),
                new ThreadPoolExecutor.CallerRunsPolicy());

    }

}
