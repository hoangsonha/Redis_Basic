package com.hsh.redis.services;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface RedisService {
    void set(String key, Object value);

    void setTimeToLive(String key, long timeToLive);

    Object get(String key);

    void delete(String key);

    void hashSet(String key, String field, Object value);

    boolean hashExists(String key, String field);

    public Map<String, Object> getField(String key);

    Object hashGet(String key, String field);

    List<Object> hashGetByFieldPrefix(String key, String fieldPrefix);

    Set<String> getFieldPrefixs(String key);

    void delete(String key, String field);

    void delete(String key, List<String> fields);
}
