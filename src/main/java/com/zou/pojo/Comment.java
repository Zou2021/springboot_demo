package com.zou.pojo;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author: 邹祥发
 * @date: 2021/4/23 17:17
 * @Entity(name = "t_comment"):设置orm实体类，并指定映射的表名
 */
@Data
@ToString
@Entity(name = "t_comment")
public class Comment {
    @Id
    //设置主键自增策略
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String content;
    private String author;

    //指定映射的表字段名
    @Column(name = "a_id")
    private  Integer aId;
}
