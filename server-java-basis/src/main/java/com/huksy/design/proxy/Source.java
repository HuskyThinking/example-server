package com.huksy.design.proxy;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/6 21:54
 */
public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}
