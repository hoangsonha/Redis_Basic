package com.hsh.redis.controlers;

import com.hsh.redis.pojos.RedisToken;
import com.hsh.redis.request.TokenRequest;
import com.hsh.redis.services.RedisTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class RedisTokenController {

    @Autowired private RedisTokenService redisTokenService;

    @PostMapping("/token/save")
    public String saveToken(@RequestBody TokenRequest redisToken) {
        redisTokenService.save(redisToken);
        return "success";
    }

    @DeleteMapping("/token/delete/{id}")
    public String deleteToken(@PathVariable String id) {
        redisTokenService.delete(id);
        return "success";
    }

    @GetMapping("/token/get/{id}")
    public String getToken(@PathVariable String id) {
        return redisTokenService.get(id);
    }

}
