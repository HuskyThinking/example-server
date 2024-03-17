package com.huksy.reflect;

import com.huksy.entity.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/17 18:22
 */
public class Reflect {

    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {

//        test01();
        test02();
    }

    public static void getClazz() throws ClassNotFoundException {
        Student student = new Student();
        // 获取class对象方式
        // 实例.getClass()
        Class clazz01 = student.getClass();
        // 类.class
        Class clazz02 = Student.class;
        // Class forName()获取
        Class clazz03 = Class.forName("com.huksy.entity.Student");
    }

    public static void test01() throws NoSuchMethodException {
        Class clazz = Student.class;

        // 获取类名
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getName());
        System.out.println("-------------------------------");

        // 获取类的属性
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println("-------------------------------");

        // 获取类方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("-------------------------------");

        // 获取类的构造器
        Constructor constructor = clazz.getDeclaredConstructor(Long.class,String.class,Integer.class);
        System.out.println(constructor.getName());
        System.out.println("-------------------------------");
    }


    public static void test02() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class clazz = Student.class;

        // 调用无参构造器
        Student student = (Student) clazz.newInstance();
        System.out.println(student.hashCode());

        // 有参构造器
        Constructor constructor = clazz.getDeclaredConstructor(Long.class,String.class,Integer.class);
        Student student1 = (Student)constructor.newInstance(1L,"北月",26);
        System.out.println(student1.toString());

        // 调用普通方法
        Method setName = clazz.getMethod("setName",String.class);
        setName.invoke(student,"御天");
        System.out.println(student.toString());

        // 操作属性
        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true); // 不能直接操作私有属性，关闭安全检测
        age.set(student,25);
        System.out.println(student);
    }
}
