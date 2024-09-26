package com.hsh.redis.services;

public interface BaseRedisNe <K, F, V> {
    void set(K key, V value);

    Object get(K key);

    void delete(K key);
}

