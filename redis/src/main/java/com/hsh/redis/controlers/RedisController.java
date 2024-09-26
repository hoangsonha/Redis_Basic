package com.hsh.redis.controlers;

import com.hsh.redis.pojos.Product;
import com.hsh.redis.services.BaseRedisNe;
import com.hsh.redis.services.ProductService;
import com.hsh.redis.services.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {
    @Autowired RedisService redisService;

    @Autowired BaseRedisNe<String, String, Object> baseRedisNe;

    @Autowired private ProductService productService;

    @PostMapping("/save")
    public void set() {
        Product product = productService.getProductByID(5);
        redisService.set("11", product);
        redisService.set("22", "22");
    }

    @GetMapping("/get/{id}")
    public Object getProduct(@PathVariable int id) {
        return redisService.get(String.valueOf(id));
    }

    @GetMapping("/get")
    public Object getProduct2() {
        return redisService.get("1");
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        redisService.delete(String.valueOf(id));
        return "Success";
    }
}
