package com.phms.config;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 基于redis采用分布式锁
 */
@Component
public class RedisLock {

    private final RedisTemplate<String, Object> redisTemplate;

    public RedisLock(RedisTemplate<String, Object> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    /**
     * 尝试获取锁
     *
     * @param key     锁的键
     * @param value   锁的值，通常是唯一标识，如 UUID
     * @param timeout 锁的过期时间，单位秒
     * @return 是否获取成功
     */
    public boolean tryLock(String key, String value, long timeout) {
        Boolean success = redisTemplate.opsForValue().setIfAbsent(key, value, timeout, TimeUnit.SECONDS);
        return Boolean.TRUE.equals(success);
    }

    /**
     * 释放锁
     *
     * @param key   锁的键
     * @param value 锁的值，确保释放的是当前持有的锁
     */
    public void unlock(String key, String value) {
        String currentValue = (String) redisTemplate.opsForValue().get(key);
        if (value.equals(currentValue)) {
            redisTemplate.delete(key);
        }
    }
}
