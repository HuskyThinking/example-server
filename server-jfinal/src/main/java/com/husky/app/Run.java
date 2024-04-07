package com.husky.app;

import com.husky.config.HuskyConfig;
import com.jfinal.server.undertow.UndertowServer;

public class Run {

    public static void main(String[] args) {
        // 启动Undertow服务器
        UndertowServer.start(HuskyConfig.class, 80, true);
    }

}
