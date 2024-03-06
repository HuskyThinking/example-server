package com.husky.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/6 16:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private String sId;

    private String sName;

    private String sBirth;

    private String sSex;

}
