package com.hsh.redis.services;

import com.hsh.redis.pojos.RedisToken;
import com.hsh.redis.repositories.RedisTokenRepository;
import com.hsh.redis.request.TokenRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedisTokenServiceImp implements RedisTokenService {

    @Autowired
    private RedisTokenRepository redisTokenRepository;

    public void save(TokenRequest redisToken) {
        RedisToken token = new RedisToken();
        token.setToken(redisToken.getToken());
        token.setRefreshToken(redisToken.getRefreshToken());
        token.setId(redisToken.getId());
        redisTokenRepository.save(token);
    }

    public void delete(String id) {

        redisTokenRepository.deleteById(id);
    }

    @Override
    public String get(String id) {
        return redisTokenRepository.findById(id).get().getToken();
    }
}
