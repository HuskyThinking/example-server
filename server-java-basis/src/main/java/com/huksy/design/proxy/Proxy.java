package com.huksy.design.proxy;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/6 21:53
 */
public class Proxy implements Sourceable{

    private Source source;

    public Proxy(){
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    public void before(){
        System.out.println("after proxy!");
    }

    public void after(){
        System.out.println("before proxy!");
    }
}
