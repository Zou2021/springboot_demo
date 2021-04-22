package com.zou.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 邹祥发
 * @date: 2021/4/22 14:58
 * @Configuration：定义该类是一个配置类
 * @Bean：将返回值对象作为组件添加到spring容器中，该组件id默认为方法名
 */
@Configuration
public class MyConfig {
    @Bean
    public MyService myService() {
        return new MyService();
    }
}
