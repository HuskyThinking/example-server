package com.husky.common;

import javax.servlet.http.HttpServletRequest;

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

    public static String getRemoteIP(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (ip == null || ip.isEmpty() || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (ip == null || ip.isEmpty() || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (ip == null || ip.isEmpty() || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }
}
