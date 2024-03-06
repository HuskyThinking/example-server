package com.husky.jedis;

import com.husky.redis.jedis.JedisConnectionFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.Map;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/2/29 21:35
 */
public class JedisTest {

    private Jedis jedis;

    @BeforeEach //被该注解修饰的方法每次执行其他方法前自动执行
    void setUp() {
        // 1. 获取连接
//        jedis = new Jedis("39.99.81.240",6379);
        jedis = JedisConnectionFactory.getJedis();
        // 2. 设置密码
        jedis.auth("741852");
        // 3. 选择库（默认是下标为0的库）
        jedis.select(0);
    }

    @AfterEach //被该注解修饰的方法会在每次执行其他方法后执行
    void tearDown(){
        // 1.释放资源
        if (jedis != null){
            jedis.close();
        }
    }

    @Test
    public void testString(){
        // 1.往redis中存放一条String类型的数据并获取返回结果
        String result = jedis.set("url", "wulala");
        System.out.println("result = " + result);

        // 2.从redis中获取一条数据
        String url = jedis.get("url");
        System.out.println("url = " + url);
    }

    /**
     * @description: TODO
     * @param:
     * @return: void
     * @author Axin
     */
    @Test
    public void hashString(){
        jedis.hset("husky:class:1","name","Lidx");
        jedis.hset("husky:class:1","age","18");

        String a = jedis.hget("husky:class:1","name");
        Map<String, String> b = jedis.hgetAll("husky:class:1");
        System.out.println(a);
        System.out.println(b.get("age"));
        System.out.println(b);
    }
}
