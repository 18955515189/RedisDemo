package Transcation;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

import java.util.List;

public class TransctionDemo {
    
    public static void main(String[] args) {
        Jedis jedis = new Jedis("hadoop01",6379);

        Transaction transaction = jedis.multi();
        transaction.set("zhouwei","zhouwei111");
        transaction.set("zhou","zhou111");
        //执行
        List<Object> exec = transaction.exec();
        System.out.println(exec);
        //取消
        //transaction.discard();
    }
    
}
