package com.huksy.design.proxy;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/6 21:57
 */
public class ProxyTest {

    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }

}
