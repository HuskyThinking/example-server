package com.husky.business.school.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.husky.business.school.model.Staff;
import com.husky.business.school.model.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author Axin
 * @since 2024-06-19
 */
@Repository
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

    Page<Staff> page(@Param("current") int current, @Param("size") int size);
}
