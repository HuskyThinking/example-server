package com.huksy.base.test;

import com.huksy.base.entity.Student;

/**
 * @description: Main001
 * @author Axin
 * @date 2024/2/25 16:57
 * @version 1.0
 */
public class Main001 {

    public static void main(String[] args) {
        equalsTest();
    }

    /**
     * @description: 测试equals方法
     * @param:
     * @return: void
     * @author Axin
     */
    private static void equalsTest(){
        Student stuOne = new Student(10001L,"Axin",20);
        Student stuTwo = new Student(10001L,"Axin",20);
        System.out.println(stuOne.equals(stuTwo));
        System.out.println(stuOne.hashCode());
        System.out.println(stuTwo.hashCode());
    }

}
