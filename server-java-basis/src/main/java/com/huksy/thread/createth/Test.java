package com.huksy.thread.createth;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/2 14:35
 */
public class Test {


    public static void main(String[] args) {
//        testTwo();
        testThree();
    }

    /**
     * @description: Runnable接口测试
     * @param:
     * @return: void
     * @author Axin
     */
    public static void testTwo() {
        //3.创建实现类的对象
        MyThreadTwo myThreadTwo = new MyThreadTwo();

        //4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1 = new Thread(myThreadTwo);
        t1.setName("线程1");

        //5.通过Thread类的对象调用start():① 启动线程 ②调用当前线程的run()-->调用了Runnable类型的target的run()
        t1.start();

        //再启动一个线程，遍历100以内的偶数
        Thread t2 = new Thread(myThreadTwo);
        t2.setName("线程2");
        t2.start();
    }

    /**
     * @description: Callable接口测试
     * @param:
     * @return: void
     * @author Axin
     */
    public static void testThree(){
        //3.创建Callable接口实现类的对象
        MyThreadThree myThreadThree = new MyThreadThree();

        //4.将此Callable接口实现类的对象作为参数传递到FutureTask构造器中，创建FutureTask的对象
        FutureTask futureTask = new FutureTask(myThreadThree);

        //5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用start()
        new Thread(futureTask).start();

        try {
            //6.获取Callable中call方法的返回值
            //get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值。
            Object sum = futureTask.get();
            System.out.println("总和为：" + sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }


}
