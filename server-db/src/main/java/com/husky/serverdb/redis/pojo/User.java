package com.husky.serverdb.redis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/1 21:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;

    private Integer age;

}
