package com.husky.business.school.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.husky.business.school.model.Staff;
import com.husky.business.school.model.UserRoleDO;
import com.husky.business.school.service.UserRoleService;
import com.husky.business.school.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author Axin
 * @since 2024-06-19
 */
@RestController
@RequestMapping("/userDO")
public class UserController {
    static String s;
    @Resource
    private UserService userService;
    @Resource
    private UserRoleService userRoleService;

    @GetMapping(value = "/page")
    public String page() {
//        Page<Staff> page = new Page<>();
//        page.setCurrent(2L);
//        page.setSize(3L);
//        page.setRecords(userService.page(page));
//        System.out.println(page);
//        System.out.println(111);
        UserRoleDO userRoleDO = new UserRoleDO();
        userRoleDO.setBank("1418");
        userRoleDO.setUserId("001");
        userRoleDO.setRoleId("2");
        userRoleService.update(userRoleDO,"3");
        return "1";
    }

    public static void main(String[] args) {
    }

}

