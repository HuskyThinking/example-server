package com.husky.business.school.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.husky.business.school.model.Staff;
import com.husky.business.school.model.UserDO;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Axin
 * @since 2024-06-19
 */
public interface UserService extends IService<UserDO> {

    List<Staff> page(Page<Staff> page);

}
