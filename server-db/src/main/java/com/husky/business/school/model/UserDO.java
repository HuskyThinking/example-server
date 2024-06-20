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
@TableName("user")
public class UserDO implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 银行号
     */
    @TableId(value = "bank", type = IdType.AUTO)
    private String bank;

    /**
     * 用户编号
     */
    private String userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 身份证号
     */
    private String idNo;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 有效状态(1有效 0无效)
     */
    private Boolean state;


}
