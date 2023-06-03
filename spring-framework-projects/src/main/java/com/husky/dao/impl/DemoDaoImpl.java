package com.husky.dao.impl;

import com.husky.BeanFactory;
import com.husky.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoDaoImpl implements DemoDao {

    DemoDao demoDao = (DemoDao) BeanFactory.getBean("demoDao");

    // 当前的代码中，因为源码中真的缺少这个 DemoDaoImpl 类，导致编译都无法通过
    // 这种现象就可以描述为 “ BeanFactory 强依赖于 DemoDaoImpl ” ，也就是咱可能听过也可能常说的“紧耦合”。

    @Override
    public List<String> findAll() {
        // 此处应该是访问数据库的操作，用临时数据代替
        return demoDao.findAll();
    }
}