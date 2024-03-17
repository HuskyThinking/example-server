package com.husky.busi.service.impl;

import com.husky.busi.controller.StudentController;
import com.husky.busi.dao.StudentMapper;
import com.husky.busi.service.CourseService;
import com.husky.busi.service.StudentService;
import com.husky.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/6 17:55
 */
@Service
public class StudentServiceImpl implements StudentService {

    private static Logger log = LoggerFactory.getLogger(StudentServiceImpl.class);

    @Resource
    private StudentMapper studentMapper;

    @Override
    public Student selectStuById(String id) {
        log.info("根据ID查询Student---------------");
        return studentMapper.selectStudentById(id);
    }
}
