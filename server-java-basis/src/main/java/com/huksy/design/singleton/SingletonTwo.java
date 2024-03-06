package com.huksy.design.singleton;

/**
 * @author Axin
 * @version 1.0
 * @description: 懒汉式，线程安全
 *                     是否 Lazy 初始化：是
 *                     是否多线程安全：是
 *                     实现难度：易
 * @date 2024/3/6 20:42
 */
public class SingletonTwo {

    private static SingletonTwo instance;

    private SingletonTwo(){
    }

    /*描述：这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
      优点：第一次调用才初始化，避免内存浪费。
      缺点：必须加锁 */
    public static synchronized SingletonTwo getInstance() {
        if (instance == null) {
            instance = new SingletonTwo();
        }
        return instance;
    }

}
