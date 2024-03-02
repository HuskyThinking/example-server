package com.huksy.thread.juc.collect;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/2 18:58
 */
public class UnSafeList {

    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
        // 点进去看add源码，加了lock
        List<String> list = new CopyOnWriteArrayList<>();

//        Set<String> set = new HashSet<>();
//        Set<String> set = Collections.synchronizedSet(new HashSet<>());
        Set<String> set = new CopyOnWriteArraySet();
        for (int i = 0; i < 30; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }


}
