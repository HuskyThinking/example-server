package com.husky;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.husky.business.school.model.Staff;
import com.husky.business.school.service.UserService;
import com.husky.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ServerDbApplicationTests {

    @Resource
    private UserService userService;

    @Test
    void contextLoads() throws Exception {
        // 数据库测试
//        Student student = studentMapper.selectStudentById("01");
//        System.out.println(student);
//        DealMsgBaseTrigger iDealMsgBaseTrigger = (DealMsgBaseTrigger)nes001Trigger;
//        iDealMsgBaseTrigger.execute("1","1");
//        StudentService studentService = new StudentServiceImpl();
        Page<Staff> page = new Page<>();
        page.setCurrent(2L);
        page.setSize(3L);
        userService.page(page);
    }

    @Test
    void aopTest() {
        PageHelper.startPage(1, 2);
//        String s = "";
////        List<Student> list = studentMapper.selectStudentByPage();
//        PageInfo<Student> pageInfo = new PageInfo<Student>(list);
//        System.out.println(list);
    }

}
