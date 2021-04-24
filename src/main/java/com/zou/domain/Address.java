package com.zou.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.redis.core.index.Indexed;

/**
 * @author: 邹祥发
 * @date: 2021/4/23 17:50
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Indexed
    private String city;
    @Indexed
    private String country;
}
