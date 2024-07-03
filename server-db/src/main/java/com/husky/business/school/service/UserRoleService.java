package com.husky.business.school.service;

import com.husky.business.school.model.UserRoleDO;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Axin
 * @since 2024-06-19
 */
public interface UserRoleService extends IService<UserRoleDO> {

    boolean update(UserRoleDO userRoleDO,String roleId);

}
