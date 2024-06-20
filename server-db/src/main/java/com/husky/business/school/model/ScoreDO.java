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
@TableName("score")
public class ScoreDO implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "s_id", type = IdType.AUTO)
    private String sId;

    private String cId;

    private Integer sScore;


}
