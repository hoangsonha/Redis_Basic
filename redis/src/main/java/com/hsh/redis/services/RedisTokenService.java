package com.hsh.redis.services;

import com.hsh.redis.pojos.RedisToken;
import com.hsh.redis.request.TokenRequest;

public interface RedisTokenService {
    public void save(TokenRequest token);

    public void delete(String id);

    public String get(String id);
}
