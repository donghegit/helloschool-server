package com.grapep.byle.cache;


import com.grapep.byle.common.constants.Parameters;
import com.grapep.byle.common.exception.ByleException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import javax.annotation.PostConstruct;


@Component
@Slf4j
public class JedisPoolWrapper {


    private JedisPool jedisPool = null;

    @Autowired
    private Parameters parameters;

    @PostConstruct
    public void init() throws ByleException {
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(parameters.getRedisMaxTotal());
            config.setMaxIdle(parameters.getRedisMaxIdle());
            config.setMaxWaitMillis(parameters.getRedisMaxWaitMillis());
            config.setMinIdle(parameters.getRedisMinIdle());

            //jedisPool = new JedisPool(parameters.getRedisHost(), parameters.getRedisPort());
            //(final GenericObjectPoolConfig poolConfig, final String host, final int port, final int timeout) {
            jedisPool = new JedisPool(config, parameters.getRedisHost(), parameters.getRedisPort(), 3000);


            Jedis resource = jedisPool.getResource();
            //resource.set("w","0000000000000000000");
            //log.info(resource.get("w"));



        } catch (Exception e) {
            log.error("Fail to initialize jedis pool", e);
            throw new ByleException("Fail to initialize jedis pool");
        }
    }

    public JedisPool getJedisPool() {
        if(jedisPool==null){
            try {
                init();
            } catch (ByleException e) {
                e.printStackTrace();
            }
        }


        return jedisPool;
    }

}
