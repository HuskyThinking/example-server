package com.huksy.base.example;

import com.huksy.entity.Student;
import com.huksy.stream.entity.Actor;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Axin
 * @version 1.0
 * @description: 集合常见方法示例，场景问题
 * @date 2024/3/4 22:01
 */
public class MapExample {

    public static void main(String[] args) {
//        map();
        Student student = new Student();
        Actor actor = new Actor("11");
        System.out.println(Integer.toString(actor.hashCode(), 2));
        System.out.println(Integer.toString(actor.hashCode() >>> 16, 2));
        System.out.println(Integer.toString(actor.hashCode() ^ (actor.hashCode() >>> 16), 2));
    }

    private static void map(){
        HashMap<String,String> hashMap = new HashMap<>();
//        hashMap.put("1","1");
//        hashMap.put("1","2");
        System.out.println(hashMap);


    }

    private static void set(){
        HashSet<String> hashSet = new HashSet<>();
    }

    private static void list(){

    }


}
