package com.zou.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;

/**
 * @author: 邹祥发
 * @date: 2021/4/23 17:44
 * @RedisHash("persons"):指定操作实体类对象在Redis数据库中的存储空间
 */
@RedisHash("persons")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PersonTwo {
    //标识实体类主键
    @Id
    private String id;
    //标识对应属性在redis数据库中中生成二级索引
    @Indexed
    private String firstName;
    @Indexed
    private String lastName;
    private Address address;
}
