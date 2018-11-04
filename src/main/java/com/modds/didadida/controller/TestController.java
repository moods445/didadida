package com.modds.didadida.controller;

import com.modds.didadida.common.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/redis")
    public String test(@RequestParam("key") String key) {
        return stringRedisTemplate.opsForValue().get(key);
    }


    @PostMapping("/redis")
    public Result cacheAdd(@RequestBody CacheEntity cacheEntity) {
        stringRedisTemplate.opsForValue().set(cacheEntity.getKey(), cacheEntity.getValue(), 1, TimeUnit.MINUTES);
        return Result.success();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus
    public Result handle(HttpServletRequest req, Exception e) {
        logger.error("Server ERROR!", e);
        return Result.failed("error");
    }

    public static class CacheEntity {
        String key;
        String value;

        public String getKey() {
            return key;
        }

        public CacheEntity setKey(String key) {
            this.key = key;
            return this;
        }

        public String getValue() {
            return value;
        }

        public CacheEntity setValue(String value) {
            this.value = value;
            return this;
        }
    }


}

