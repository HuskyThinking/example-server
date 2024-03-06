package com.huksy.design.singleton;

/**
 * @author Axin
 * @version 1.0
 * @description: 饿汉式
 *                  是否 Lazy 初始化：否
 *                  是否多线程安全：是
 *                  实现难度：易
 * @date 2024/3/6 20:43
 */
public class SingletonThree {

    private static SingletonThree instance = new SingletonThree();

    private SingletonThree() {
    }

    /*描述：这种方式比较常用，但容易产生垃圾对象。
      优点：没有加锁，执行效率会提高。
      缺点：类加载时就初始化，浪费内存。*/
    public static SingletonThree getInstance() {
        return instance;
    }

}
