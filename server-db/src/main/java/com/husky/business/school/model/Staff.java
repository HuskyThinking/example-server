package com.husky.business.school.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/6/19 23:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {

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

    /**
     * 规则编号
     */
    private String roleId;

}
