package com.husky.service;

import com.husky.spring.*;

@Component
public class UserService implements BeanNameAware, InitializingBean, UserInterface {

    @Autowired
    private OrderService orderService;

    private String beanName;

    private String help;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("help");
    }

    @Override
    public void test() {
        System.out.println(orderService);
    }


}
