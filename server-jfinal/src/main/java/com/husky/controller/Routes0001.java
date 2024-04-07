package com.husky.controller;

import com.jfinal.config.Routes;

public class Routes0001 extends Routes {
    @Override
    public void config() {
        add("/hello", HelloController.class);
        add("/student", StudentController.class);
    }
}
