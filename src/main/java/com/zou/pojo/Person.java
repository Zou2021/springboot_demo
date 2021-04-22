package com.zou.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author: 邹祥发
 * @date: 2021/4/16 19:27
 * @Component 用于将Person类作为Bean注入到Spring容器中
 * @ConfigurationProperties(prefix = "person") 将配置文件中以person开头的属性注入到该类中
 */

@Component
@ConfigurationProperties(prefix = "person")
@Data
@ToString
public class Person {
    private int id;
    private String name;
    private List<String> hobby;
    private String[] family;
    private Map<String,Object> map;
    private Pet pet;
}
