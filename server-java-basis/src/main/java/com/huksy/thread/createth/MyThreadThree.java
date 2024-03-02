package com.huksy.thread.createth;

import java.util.concurrent.Callable;

/**
 * @author Axin
 * @version 1.0
 * @description: 1. 创建一个实现Callable的实现类
 * @date 2024/3/2 14:39
 */
public class MyThreadThree implements Callable {

    /**
     * @description: 2.实现call方法，将此线程需要执行的操作声明在call()中
     * @param:
     * @return: java.lang.Object
     * @author Axin
     */
    @Override
    public Object call() throws Exception {

        int sum = 0;
        //把100以内的偶数相加
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }

        return sum;
    }
}
