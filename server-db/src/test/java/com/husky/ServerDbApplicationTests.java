package com.husky;

import com.husky.busi.dao.StudentMapper;
import com.husky.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServerDbApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Test
    void contextLoads() {
        // 数据库测试
        Student student = studentMapper.selectStudentById("01");
        System.out.println(student);
    }

    @Test
    void aopTest() {

    }

}
