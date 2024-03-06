package com.huksy.design.singleton;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/6 20:55
 */
public class Singleton {

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    private Singleton (){
    }

    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
