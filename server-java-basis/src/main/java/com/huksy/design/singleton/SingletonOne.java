package com.huksy.design.singleton;

/**
 * @author Axin
 * @version 1.0
 * @description: 懒汉式，线程不安全
 *                      是否 Lazy 初始化：是
 *                      是否多线程安全：否
 *                      实现难度：易
 * @date 2024/3/6 20:36
 */
public class SingletonOne {

    private static SingletonOne instance;

    private SingletonOne(){
    }

    public static SingletonOne getInstance() {
        if (instance == null) {
            instance = new SingletonOne();
        }
        return instance;
    }

}
