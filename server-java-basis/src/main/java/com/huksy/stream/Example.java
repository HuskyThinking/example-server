package com.huksy.stream;

import com.huksy.stream.entity.Actor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Axin
 * @version 1.0
 * @description: 基本练习
 * @date 2024/3/2 21:16
 */
public class Example {

    public static void main(String[] args) {
//        filterTest();
//        limitTest();
//        forEachTest();
//        mapTest();
        test();
    }

    /**
     * @description: filter、结果收集(数组)
     * @param:
     * @return: void
     */
    public static void filterTest() {
        // 有如下7个元素黄药师，冯蘅，郭靖，黄蓉，郭芙，郭襄，郭破虏，使用Stream将以郭字开头的元素存入新数组
        Stream<String> stream = Stream.of("黄药师", "冯蘅", "郭靖", "黄蓉", "郭芙", "郭襄", "郭破虏");
        stream.filter(s -> s.startsWith("郭")).forEach(System.out::println);
    }

    /**
     * @description: 取用前几个：limit、跳过前几个：skip
     * @param:
     * @return: void
     */
    public static void limitTest() {
         ArrayList<String> arrayList = new ArrayList<>();
         arrayList.add("陈玄风");
         arrayList.add("梅超风");
         arrayList.add("陆乘风");
         arrayList.add("曲灵风");
         arrayList.add("武眠风");
         arrayList.add("冯默风");
         arrayList.add("罗玉风");
        //已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，使用Stream
        //1、取出前2个元素并在控制台打印输出。
        //2、取出后2个元素并在控制台打印输出。
        arrayList.stream().limit(2).forEach(System.out::println);
        arrayList.stream().skip(5).forEach(System.out::println);
    }

    /**
     * @description: 映射：map、逐一消费：forEach
     * @param:
     * @return: void
     */
    public static void forEachTest() {
        Stream<Integer> stream = Stream.of(1, -2, -3, 4, -5);
        // 有如下整数1，-2，-3，4，-5 使用Stream取元素绝对值并打印
        stream.forEach(num -> System.out.println(Math.abs(num)));
    }

    /**
     * @description: 映射：map
     * @param:
     * @return: void
     */
    public static void mapTest() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//        给定一个数字列表，如何返回一个由每个数的平方构成的列表呢？
//        比如给定【1，2，3，4，5】， 应该返回【1，4，9，16，25】。
        List<Integer> result = numbers.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println(result);
    }

    /**
     * @description: 综合
     * @param:
     * @return: void
     */
    public static void test() {

        ArrayList<String> manArray = new ArrayList<>();
        manArray.add("刘德华");
        manArray.add("成龙");
        manArray.add("吴彦祖");
        manArray.add("周润发");
        manArray.add("周星驰");
        manArray.add("吴京");

        ArrayList<String> womanList = new ArrayList<>();
        womanList.add("林心如");
        womanList.add("孙俪");
        womanList.add("柳岩");
        womanList.add("林青霞");
        womanList.add("王祖贤");
        womanList.add("张曼玉");

//        男演员只要名字为3个字的前三人
        Stream<String> manStream = manArray.stream().filter(man -> man.length() == 3).limit(3);
//        女演员只要姓林的，并且不要第一个
        Stream<String> womanStream = womanList.stream().filter(woman -> woman.startsWith("林")).skip(1);
//        把过滤后的男演员姓名和女演员姓名合并到一起
        Stream<String> stream = Stream.concat(manStream,womanStream);
//        把上一步操作后的元素作为构造方法的参数创建演员对象（实例化一个Actor类，此处尝试使用map），遍历数组
        List<Actor> a = stream.map(Actor::new).collect(Collectors.toList());
        System.out.println(a);
    }

}
