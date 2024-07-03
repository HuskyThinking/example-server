package com.husky.business.school.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.husky.business.school.mapper.UserMapper;
import com.husky.business.school.model.Staff;
import com.husky.business.school.model.UserDO;
import com.husky.business.school.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    public Page<Staff> page(Page<Staff> page) {
        return userMapper.page((int) page.getCurrent(), (int) page.getSize());
    }

    @Override
    public Boolean updateOne(Staff staff) {
        UserDO userDO = new UserDO();
        userDO.setBank(staff.getBank());
        userDO.setUserId(staff.getUserId());
        userDO.setName(staff.getName());
        userDO.setMobile(staff.getMobile());
        userDO.setIdNo(staff.getIdNo());
        userDO.setState(staff.getState());
        LambdaUpdateWrapper<UserDO> wrapper = new LambdaUpdateWrapper<>();
        wrapper.eq(UserDO::getBank, userDO.getBank())
                .eq(UserDO::getUserId, userDO.getUserId());
        return update(userDO, wrapper);
    }

    @Override
    public Boolean deleteOne(Staff staff) {
        UserDO userDO = new UserDO();
        userDO.setBank("1418");
//        LambdaQueryChainWrapper<UserDO> wrapper = new LambdaQueryChainWrapper<>();
//        wrapper.eq()
//        return remove();
        return null;
    }
}
