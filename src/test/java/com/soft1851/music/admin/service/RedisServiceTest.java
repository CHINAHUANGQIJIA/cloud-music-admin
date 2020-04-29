package com.soft1851.music.admin.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RedisServiceTest {
    @Resource
    private RedisService redisService;

    @Test
    void testSet() {
        //redis配置中设置的过期时间单位是分钟
        redisService.set("test", "123", 1L);
    }

    @Test
    void testExistsKey() {
        System.out.println(redisService.existsKey("test"));
    }
}