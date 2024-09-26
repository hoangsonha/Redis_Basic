package com.hsh.redis.services;

import org.springframework.stereotype.Service;

@Service
public class BaseRedisNeImp <K, F, V> implements BaseRedisNe<K, F, V> {

    // inject bean de xu li logic


    // 1 key chứa nhiều keyfield mỗi keyfield có 1 value.

    @Override
    public void set(K key, V value) {

    }

    @Override
    public Object get(K key) {
        return null;
    }

    @Override
    public void delete(K key) {

    }
}
