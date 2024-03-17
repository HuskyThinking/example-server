package com.huksy.entity;

import java.util.Objects;

/**
 * @description: 学生类
 * @author Axin
 * @date 2024/2/25 16:56
 * @version 1.0
 */
public class Student {

    private Long id;

    private String name;

    private Integer age;

    public Student() {
    }

    public Student(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // 1. 先判断两个对象地址是否相等
        if (this == o) return true;
        // 2. 判断两个类的对象类型是否一致
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        // 3. 比较对象里的属性是否相同
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
}

