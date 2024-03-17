package com.husky.busi.controller;

import com.husky.annotation.AnnotationTest;
import com.husky.busi.service.StudentService;
import com.husky.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/6 17:56
 */
@Controller
@RequestMapping("stu")
public class StudentController {

    @Resource
    StudentService studentService;

    @RequestMapping(value = "/selectById",method = RequestMethod.GET)
    @ResponseBody
    @AnnotationTest(type = "2")
    public Student selectStuById(@RequestParam("id") String id) {
        return studentService.selectStuById(id);
    }

}
