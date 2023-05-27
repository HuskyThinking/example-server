package com.husky.service;

import com.husky.spring.Autowired;
import com.husky.spring.Component;
import com.husky.spring.Scope;

@Component
public class UserService {

    @Autowired
    private OrderService orderService;

    public void test() {
        System.out.println(orderService);
    }
}
