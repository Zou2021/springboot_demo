package com.zou.repository;

import com.zou.domain.PersonTwo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author: 邹祥发
 * @date: 2021/4/23 17:52
 */
public interface PersonRepository extends CrudRepository<PersonTwo, String> {
    List<PersonTwo> findAddress_City(String 衡阳);
}
