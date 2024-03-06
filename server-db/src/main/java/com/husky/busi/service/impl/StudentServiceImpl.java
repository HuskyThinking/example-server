package com.husky.busi.service.impl;

import com.husky.busi.dao.StudentMapper;
import com.husky.busi.service.StudentService;
import com.husky.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/6 17:55
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectStuById(String id) {
        return studentMapper.selectStudentById(id);
    }
}
