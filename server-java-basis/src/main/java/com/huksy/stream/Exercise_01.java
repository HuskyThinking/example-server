package com.huksy.stream;

import com.huksy.stream.entity.Trader;
import com.huksy.stream.entity.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/2 21:59
 */
public class Exercise_01 {

    public static void main(String[] args) {

        /*
            1) javabean类
                Trader（交易员）: 姓名 工作城市
                Transaction（交易记录）: 交易员  交易年份 交易金额
            2) 实现
                (1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
                (2) 交易员都在哪些不同的城市工作过？
                (3) 查找所有来自于剑桥的交易员，并按姓名排序。
                (4) 返回所有交易员的姓名字符串，按字母顺序排序。
                (5) 有没有交易员是在米兰工作的？
                (6) 打印生活在剑桥的交易员的所有交易额。
                (7) 所有交易中，最高的交易额是多少？
                (8) 找到交易额最小的交易。
        */
        List<Transaction> list =new ArrayList();
        list.add(new Transaction(new Trader("张三","上海"),2008,478));
        list.add(new Transaction(new Trader("李四","剑桥"),2011,9874));
        list.add(new Transaction(new Trader("王二麻子","深圳"),2018,2394));
        list.add(new Transaction(new Trader("狗蛋儿","米兰"),2009,4857));
        list.add(new Transaction(new Trader("泥娃儿","剑桥"),2011,4590));
        list.add(new Transaction(new Trader("111","22"),2011,3000));


//        (1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
        list.stream()
                .filter(tr -> tr.getYearOfTransaction() == 2011)
                .sorted((x,y) -> y.getTransactionAmount()-x.getTransactionAmount())
                .forEach(System.out::println);
//        (2) 交易员都在哪些不同的城市工作过？
        list.stream()
                .map(tr ->  tr.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
//        (3) 查找所有来自于剑桥的交易员，并按姓名排序。
//        (4) 返回所有交易员的姓名字符串，按字母顺序排序。
//        (5) 有没有交易员是在米兰工作的？
//        (6) 打印生活在剑桥的交易员的所有交易额。
//        (7) 所有交易中，最高的交易额是多少？
//        (8) 找到交易额最小的交易。

    }

}
