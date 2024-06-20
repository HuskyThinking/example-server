package com.husky.business.school.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.husky.business.school.model.Staff;
import com.husky.business.school.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Axin
 * @since 2024-06-19
 */
@RestController
@RequestMapping("/userDO")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping(value = "/page")
    public String page() {
        Page<Staff> page = new Page<>();
        page.setCurrent(2L);
        page.setSize(3L);
//        page.setRecords(userService.page(page));
        System.out.println(userService.page(page));
        System.out.println(111);
        return "1";
    }

    @GetMapping(value = "/deleteOne")
    public String deleteOne() {

//        userService.page(page)
        System.out.println(111);
        return "1";
    }

    @GetMapping(value = "/updateOne")
    public String updateOne() {
        Staff staff = new Staff();
        staff.setBank("1418");
        staff.setUserId("001");
        staff.setName("测试呜啦啦");
        userService.updateOne(staff);
        System.out.println(111);
        return "1";
    }

}

