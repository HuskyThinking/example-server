package com.husky.business.school.mapper;

import com.husky.business.school.model.StudentDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Axin
 * @since 2024-06-19
 */
@Repository
@Mapper
public interface StudentMapper extends BaseMapper<StudentDO> {

}
