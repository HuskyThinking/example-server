package com.husky.business.school.service.impl;

import com.husky.business.school.model.UserDO;
import com.husky.business.school.mapper.UserMapper;
import com.husky.business.school.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

}
