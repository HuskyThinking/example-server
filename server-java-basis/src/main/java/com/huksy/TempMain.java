package com.huksy;

import cn.hutool.core.thread.ThreadUtil;

public class TempMain {

    public static void main(String[] args) {
        int a = 1;
        if (1 == a) {
            System.out.println(111);
        } else if (1 == a) {
            System.out.println(222);
        }
    }

    public static boolean execute(boolean flag) {
        ThreadUtil.execute(() -> {
            if (flag) {
                System.out.println(1111);
                return;
            }
            if (flag) {
                System.out.println(2222);
                return;
            }
        });
        return true;
    }

    public static String name(String str) {
        switch (str) {
            case "B71":
            case "B72":
                return "B70";
            default:
                return null;
        }

    }

}
