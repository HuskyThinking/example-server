package com.husky.business.school.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.husky.business.school.mapper.UserRoleMapper;
import com.husky.business.school.model.UserRoleDO;
import com.husky.business.school.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Axin
 * @since 2024-06-19
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRoleDO> implements UserRoleService {

    @Override
    public boolean update(UserRoleDO userRoleDO, String roleId) {
        LambdaUpdateWrapper<UserRoleDO> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(UserRoleDO::getBank, userRoleDO.getBank())
                .eq(UserRoleDO::getUserId, userRoleDO.getUserId())
                .eq(UserRoleDO::getRoleId, userRoleDO.getRoleId())
                .set(UserRoleDO::getRoleId, roleId);
        return update(updateWrapper);
    }
}
