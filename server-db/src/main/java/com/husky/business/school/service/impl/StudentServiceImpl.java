package com.husky.business.school.service.impl;

import com.husky.business.school.model.StudentDO;
import com.husky.business.school.mapper.StudentMapper;
import com.husky.business.school.service.StudentService;
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
public class StudentServiceImpl extends ServiceImpl<StudentMapper, StudentDO> implements StudentService {

}
