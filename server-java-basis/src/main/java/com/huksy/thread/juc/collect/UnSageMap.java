package com.huksy.thread.juc.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/2 19:25
 */
public class UnSageMap {

    public static void main(String[] args) {
//        HashMap<String, String> map = new HashMap<>();
        Map<String,String> map = new ConcurrentHashMap<>();
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                map.put(Thread.currentThread().getName(),UUID.randomUUID().toString().substring(0, 8));
                System.out.println(map);
            }, String.valueOf(i)).start();
        }
    }

}
