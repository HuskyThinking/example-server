package com.husky.business.school.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Axin
 * @since 2024-06-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("course")
public class CourseDO implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "c_id", type = IdType.AUTO)
    private String cId;

    private String cName;

    private String tId;


}
