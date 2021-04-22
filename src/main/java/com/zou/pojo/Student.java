package com.zou.pojo;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author: 邹祥发
 * @date: 2021/4/22 14:29
 */
@Component
@ToString
public class Student {

 @Value("${person.id}")
 private Integer id;
 @Value("${person.name}")
 private String name;
}
