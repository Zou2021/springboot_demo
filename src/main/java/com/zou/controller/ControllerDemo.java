package com.zou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: 邹祥发
 * @date: 2021/4/16 17:48
 * springBoot启动程序的目录一定要在controller等目录的至少上一级，或者在SpringBootApplication 注解中添加属性：
 * @SpringBootApplication(scanBasePackages = {"com.zou.controller"})
 */
@RestController
public class ControllerDemo {

    @RequestMapping("/demo")
    public String demo(){
        return "小邹太帅了";
    }

}
