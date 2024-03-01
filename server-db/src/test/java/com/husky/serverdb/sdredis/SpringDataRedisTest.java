package com.husky.serverdb.sdredis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.husky.serverdb.redis.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/2/29 22:45
 */
@SpringBootTest
public class SpringDataRedisTest {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

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

    @Test
    void testSaveUser() {
        // 写入数据
        redisTemplate.opsForValue().set("user:100",new User("LIDX",30));
        redisTemplate.opsForValue().set("user:90",new User("husky",60));

        // 获取数据
        User user = (User) redisTemplate.opsForValue().get("user:90");

        System.out.println(user);
    }

    @Test
    void testSaveUserTwo() throws JsonProcessingException {
        // 2.将要存入的对象通过Json序列化对象转换为字符串
        String userJson1 = objectMapper.writeValueAsString(new User("Vz", 21));
        // 3.通过StringRedisTemplate将数据存入redis
        stringRedisTemplate.opsForValue().set("user:100",userJson1);
        // 4.通过key取出value
        String userJson2 = stringRedisTemplate.opsForValue().get("user:100");
        // 5.由于取出的值是String类型的Json字符串，因此我们需要通过Json序列化对象来转换为java对象
        User user = objectMapper.readValue(userJson2, User.class);
        // 6.打印结果
        System.out.println("user = " + user);
    }

}

