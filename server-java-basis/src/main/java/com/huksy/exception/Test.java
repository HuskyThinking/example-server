package com.huksy.exception;

/**
 * @author Axin
 * @version 1.0
 * @description:
 * @date 2024/3/3 19:52
 */
public class Test {

    public static void main(String[] args) {
        exception(1,2);
        String s0 = new String("aaa");
        StringBuffer s1 = new StringBuffer("aaa");
        StringBuilder s2 = new StringBuilder("aaa");
    }

    private static void exception(int a, int b){
        if (a < b) {
            throw new MyException();
        }
    }

}
