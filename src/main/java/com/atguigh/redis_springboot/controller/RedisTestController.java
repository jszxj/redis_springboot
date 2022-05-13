package com.atguigh.redis_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@RestController
@RequestMapping("/redisTest")
public class RedisTestController {
    @Autowired
    private RedisTemplate  redisTemplate;
    @GetMapping
public String testRedis(){
//        new ThreadPoolExecutor();
//        new Executor();
//        redisTemplate.opsForValue().set("name","lucy");
//        String name = (String) redisTemplate.opsForValue().get("name");
        return "name";
    }
}
