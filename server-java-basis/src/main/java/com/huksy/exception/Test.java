package com.huksy.exception;

/**
 * @author Axin
 * @version 1.0
 * @description:
 * @date 2024/3/3 19:52
 */
public class Test {

    public static void main(String[] args) {
//        exception(1,2);
//        String s0 = new String("aaa");
//        StringBuffer s1 = new StringBuffer("aaa");
//        StringBuilder s2 = new StringBuilder("aaa");
        Integer a = 1000,b = 1000;
        Integer c = 100,d = 100;
        System.out.println(a == b);
        System.out.println(c == d);
    }

    private static void exception(int a, int b){
        if (a < b) {
            throw new MyException();
        }
    }

}
