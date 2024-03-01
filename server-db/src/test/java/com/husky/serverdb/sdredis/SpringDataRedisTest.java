package com.husky.serverdb.sdredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/2/29 22:45
 */
@SpringBootTest
public class SpringDataRedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void testSpring() {
        // 1.通过RedisTemplate获取操作String类型的ValueOperations对象
        ValueOperations ops = redisTemplate.opsForValue();
        // 2.插入一条数据
        ops.set("blogName","Vz-Blog");

        // 3.获取数据
        String blogName = (String) ops.get("blogName");
        System.out.println("blogName = " + blogName);
    }

}
