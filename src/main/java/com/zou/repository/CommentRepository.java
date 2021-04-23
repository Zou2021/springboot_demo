package com.zou.repository;

import com.zou.pojo.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: 邹祥发
 * @date: 2021/4/23 17:25
 */
public interface CommentRepository extends JpaRepository<Comment,Integer> {
}
