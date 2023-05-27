package com.husky.service;

import com.husky.spring.HuskyApplicationContext;

public class Test {

    public static void main(String[] args) {

        HuskyApplicationContext huskyApplicationContext = new HuskyApplicationContext(AppConfig.class);
        UserService userService = (UserService) huskyApplicationContext.getBean("userService");
        userService.test();

    }

}
