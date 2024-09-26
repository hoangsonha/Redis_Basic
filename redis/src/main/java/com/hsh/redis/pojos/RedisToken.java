package com.hsh.redis.pojos;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@RedisHash("RedisTokenNe")
public class RedisToken implements Serializable {
    private String id;
    private String token;
    private String refreshToken;
}
