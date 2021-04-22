package com.zou.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author: 邹祥发
 * @date: 2021/4/22 14:43
 * @Configuration：自定义配置类
 * @PropertySource("classpath:test.properties")：指定自定义配置文件的位置和名称
 * @EnableConfigurationProperties(MyProperties.class)：开启对应配置类的属性注入功能
 * @ConfigurationProperties(prefix = "test")：指定配置文件注入属性前缀
 * 使用@Component注解可以代替@Configuration+@EnableConfigurationProperties(MyProperties.class)
 */
@Data
@ToString
@Configuration
@PropertySource(value = {"classpath:test.properties"},encoding = "utf-8")
@EnableConfigurationProperties(MyProperties.class)
@ConfigurationProperties(prefix = "test")
public class MyProperties {
 private Integer id ;
 private String name ;

}
