package com.husky.business.school.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.husky.business.school.model.Staff;
import com.husky.business.school.model.UserDO;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author Axin
 * @since 2024-06-19
 */
public interface UserService extends IService<UserDO> {

    Page<Staff> page(Page<Staff> page);

    Boolean updateOne(Staff staff);

    Boolean deleteOne(Staff staff);

}
