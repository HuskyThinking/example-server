package com.husky.serverdb.redis.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/2/29 22:25
 */
public class JedisConnectionFactory {

    private static final JedisPool jedisPool;

    static {
        //配置连接池
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(8);
        jedisPoolConfig.setMaxIdle(8);
        jedisPoolConfig.setMinIdle(0);
        //创建连接池对象
        jedisPool = new JedisPool(jedisPoolConfig,"39.99.81.240",6379,1000,"741852");
    }

    public static Jedis getJedis(){
        return jedisPool.getResource();
    }

}
