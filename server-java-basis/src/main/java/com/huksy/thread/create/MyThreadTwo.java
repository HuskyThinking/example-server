package com.huksy.thread.create;

/**
 * @author Axin
 * @version 1.0
 * @description: 1.创建一个实现了Runnable接口的类
 * @date 2024/3/2 14:34
 */
public class MyThreadTwo implements Runnable{

    /**
     * @description: 2.实现类去实现Runnable中的抽象方法：run()
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
}
