package com.hebut.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.hebut")   //扫描包
@PropertySource("classpath:jdbc.properties")  // 外部配置文件 引入
@EnableAspectJAutoProxy     // 面向切面编程
@Configuration      // 配置类   所有配置类都要写
public class JavaBeanConfig {
}
