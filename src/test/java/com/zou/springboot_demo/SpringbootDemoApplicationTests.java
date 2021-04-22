package com.zou.springboot_demo;

import com.zou.controller.ControllerDemo;
import com.zou.pojo.MyProperties;
import com.zou.pojo.Person;
import com.zou.pojo.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

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

}
