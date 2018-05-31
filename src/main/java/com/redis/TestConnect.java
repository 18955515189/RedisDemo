package com.redis;

import redis.clients.jedis.Jedis;

/**
 * redis 链接测试
 * Created by david on 2018/5/31.
 */
public class TestConnect {
    public static void main(String[] args) {
        //创建一个客户端
        Jedis jedis = new Jedis( "hadoop01",6379 );

        //测试服务器是否联通
        String resp = jedis.ping();

        System.out.println("resp:"+resp);
    }
}
