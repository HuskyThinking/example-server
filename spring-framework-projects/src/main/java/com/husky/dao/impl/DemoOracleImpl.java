package com.husky.dao.impl;

import com.husky.dao.DemoDao;

import java.util.Arrays;
import java.util.List;

public class DemoOracleImpl implements DemoDao {
    @Override
    public List<String> findAll() {
        return Arrays.asList("oracle", "oracle", "oracle");
    }
}
