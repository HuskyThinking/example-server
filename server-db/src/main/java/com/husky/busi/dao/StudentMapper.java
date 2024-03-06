package com.husky.busi.dao;

import com.husky.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/6 17:00
 */
@Mapper
@Repository
public interface StudentMapper {

    /**
     * @description: TODO
     * @param: id
     * @return: com.husky.entity.Student
     */
    Student selectStudentById(String id);

}
