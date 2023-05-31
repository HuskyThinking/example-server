package com.husky.service.impl;

import com.husky.dao.DemoDao;
import com.husky.dao.impl.DemoDaoImpl;
import com.husky.service.DemoService;

import java.util.List;

public class DemoServiceImpl implements DemoService {

    private DemoDao demoDao = new DemoDaoImpl();

    @Override
    public List<String> findAll() {
        return demoDao.findAll();
    }
}
