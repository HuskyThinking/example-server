package com.husky.business.school.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.husky.business.school.model.Staff;
import com.husky.business.school.model.UserDO;
import com.husky.business.school.mapper.UserMapper;
import com.husky.business.school.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Axin
 * @since 2024-06-19
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<Staff> page(Page<Staff> page) {
        return userMapper.page((int)page.getCurrent(),(int)page.getSize());
    }
}
