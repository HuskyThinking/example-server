package com.huksy.design.singleton;

/**
 * @author Axin
 * @version 1.0
 * @description: 双检锁/双重校验锁（DCL，即 double-checked locking） JDK 版本：JDK1.5 起
 *                  是否 Lazy 初始化：是
 *                  是否多线程安全：是
 *                  实现难度：较复杂
 * @date 2024/3/6 20:50
 */
public class SingletonFour {

    private static SingletonFour instance;

    private SingletonFour(){
    }

    public static SingletonFour getInstance() {
        if (instance == null) {
            synchronized (SingletonFour.class) {
                if (instance == null) {
                    instance = new SingletonFour();
                }
            }
        }
        return instance;
    }

}
