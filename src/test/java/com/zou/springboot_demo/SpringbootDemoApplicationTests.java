package com.zou.springboot_demo;

import com.zou.controller.ControllerDemo;
import com.zou.domain.Address;
import com.zou.domain.PersonTwo;
import com.zou.entity.SimpleBean;
import com.zou.pojo.Comment;
import com.zou.pojo.MyProperties;
import com.zou.pojo.Person;
import com.zou.pojo.Student;
import com.zou.repository.CommentRepository;
import com.zou.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

/**
 * @RunWith(SpringRunner.class) 测试启动器，并加载springboot测试注解
 * @SpringBootTest 标记为springboot单元测试类，并加载项目的ApplicationContext上下文环境
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootDemoApplicationTests {

    @Autowired
    private ControllerDemo controllerDemo;

    @Test
    void contextLoads() {
        String demo = controllerDemo.demo();
        System.out.println(demo);
    }

    /**
     * 配置测试
     */
    @Autowired
    private Person person;

    @Test
    void configurationTest() {
        System.out.println(person);
    }

    /**
     * @Value注释测试
     */
    @Autowired
    private Student student;

    @Test
    void studentTest() {
        System.out.println(student);
    }

    /**
     * 测试MyProperties
     */
    @Autowired
    private MyProperties myProperties;

    @Test
    void myPropertiesTest() {
        System.out.println(myProperties);
    }

    /**
     * 测试 MyService
     */
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void iocTest() {
        System.out.println(applicationContext.containsBean("myService"));
    }

    /**
     * 随机 测试
     */
    @Value("${tom.description}")
    private String description;
    @Test
    public void placeholderTest(){
        System.out.println(description);
    }

    /**
     * 自定义starter 测试
     */
    @Autowired
    private SimpleBean simpleBean;

    @Test
    public void simpleBeanTest(){
        System.out.println(simpleBean);
    }

    /**
     * jpa 测试
     */
    @Autowired
    private CommentRepository commentRepository;

    @Test
    public void jpaTest(){
        Optional<Comment> optional = commentRepository.findById(1);
        optional.ifPresent(System.out::println);
        System.out.println();
    }

    /**
     * redis 测试
     */
    @Autowired
    private PersonRepository personRepository;

    @Test
    public void redisTest(){
        PersonTwo personTwo = new PersonTwo();
        personTwo.setFirstName("小");
        personTwo.setLastName("邹");

        Address address = new Address();
        address.setCity("衡阳");
        address.setCountry("中国");
        personTwo.setAddress(address);
        //向redis数据库添加数据
        PersonTwo save = personRepository.save(personTwo);

        //输出数据
//        List<PersonTwo> list = personRepository.findAddress_City("衡阳");
//            for(personTwo personTwo : list){
//                System.out.println(personTwo);
//            }
    }
}
