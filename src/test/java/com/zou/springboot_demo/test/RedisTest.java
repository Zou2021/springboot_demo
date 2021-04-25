package com.zou.springboot_demo.test;

import com.zou.domain.Address;
import com.zou.domain.PersonTwo;
import com.zou.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: 邹祥发
 * @date: 2021/4/25 10:23
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {
    /**
     * redis 测试
     */
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void savePerson() {
        PersonTwo personTwo = new PersonTwo();
        personTwo.setFirstName("小");
        personTwo.setLastName("邹");

        Address address = new Address();
        address.setCity("衡阳");
        address.setCountry("中国");
        personTwo.setAddress(address);
        //向redis数据库添加数据
        PersonTwo save = personRepository.save(personTwo);
    }

    /**
     * 报错
     */
    /*@Test
    public void selectPerson() {
        List<PersonTwo> list = personRepository.findAddressCity("personTwo");
        for (PersonTwo personTwo : list) {
            System.out.println(personTwo);
        }
    }*/
}
