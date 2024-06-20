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
@TableName("user_role")
public class UserRoleDO implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 银行号
     */
    private String bank;

    /**
     * 用户编号
     */
    private String userId;

    /**
     * 规则编号
     */
    private String roleId;

    /**
     * 有效状态(1有效 0无效)
     */
    private Boolean state;


}
