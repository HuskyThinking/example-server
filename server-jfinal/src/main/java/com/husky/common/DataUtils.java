package com.husky.common;

public class DataUtils {

    /**
     * 判断string是否为空
     *
     * @param string
     * @return 如果为空或null字符串则返回true，否则返回true
     */
    public static boolean isEmpty(String string) {
        if (string == null || string.trim().length() == 0 || string.equals("null")) {
            return true;
        } else {
            return false;
        }
    }

}
