package com.huksy.base.example;

/**
 * @author Axin
 * @version 1.0
 * @description: String常见方法示例
 * @date 2024/3/4 21:49
 */
public class StringExample {

    public static void main(String[] args) {

        String str = "hello,Lidx";

        // substring(0, 2)
        substringEg(str);
        // startsWith("hello")
        startsWithEg(str);
        //


    }

    public static void substringEg(String str) {
        // substring(0,2),左闭又开区间
        System.out.println("substring(): ");
        System.out.println("substring(0,2): " + str.substring(0, 2));
        System.out.println("substring(2,6): " + str.substring(2, 6));
        // 越界,报错
//        System.out.println("substring(6,12)"+str1.substring(6,12));
        System.out.println("---------------------------");
    }

    public static void startsWithEg(String str) {
        // startsWith("hello"),
        System.out.println("startsWith(): ");
        System.out.println("substring(\"h\"): " + str.startsWith("h"));
        System.out.println("substring(\"hello\"): " + str.startsWith("hello"));
        System.out.println("substring(\"hi\"): " + str.startsWith("hi"));
        System.out.println("---------------------------");
    }

}
