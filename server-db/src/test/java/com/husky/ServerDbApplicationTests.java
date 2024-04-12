package com.husky;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.husky.busi.dao.StudentMapper;
import com.husky.busi.service.StudentService;
import com.husky.busi.service.impl.NES001Trigger;
import com.husky.busi.service.impl.StudentServiceImpl;
import com.husky.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.List;

@SpringBootTest
@EnableAspectJAutoProxy(proxyTargetClass = true)
class ServerDbApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private NES001Trigger nes001Trigger;

    @Test
    void contextLoads() throws Exception {
        // 数据库测试
//        Student student = studentMapper.selectStudentById("01");
//        System.out.println(student);
//        DealMsgBaseTrigger iDealMsgBaseTrigger = (DealMsgBaseTrigger)nes001Trigger;
//        iDealMsgBaseTrigger.execute("1","1");
        StudentService studentService = new StudentServiceImpl();

    }

    @Test
    void aopTest() {
        PageHelper.startPage(1, 2);
        String s = "";
        List<Student> list = studentMapper.selectStudentByPage();
        PageInfo<Student> pageInfo = new PageInfo<Student>(list);
        System.out.println(list);
    }

}
