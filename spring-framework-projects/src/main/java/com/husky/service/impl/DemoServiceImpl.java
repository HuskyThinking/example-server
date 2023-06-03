package com.husky.service.impl;

import com.husky.BeanFactory;
import com.husky.dao.DemoDao;
import com.husky.dao.impl.DemoDaoImpl;
import com.husky.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    @Override
    public List<String> findAll() {
        for (int i = 0; i < 10; i++) {
            System.out.println(BeanFactory.getBean("demoDao"));
        }
        return demoDao.findAll();
    }
}
