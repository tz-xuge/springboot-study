package com.hebut;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Printable;

public class beanTest {

    // 如何创建ioc容器 并读取配置文件

    public void creatIoC() {
        /*
         *
         * BeanFactory
         *
         * ApplicationContext
         *
         * 实现类
         * 可以直接通过构造函数实例化!
         * CLassPathXmLApplicationContext  读取类路径下的xmL配置方式classes
         * FileSystemXmLApplicationContext  读取指定文件位置的xmL配置方式
         * AnnotationConfigApplicationContext 读取配置类方式的ioc容器
         * webApplicationContext web项目专属的配置的ioc容器
         *
         * */

        // 方式1:直接创建容器并且指定配置文件即可[推荐]
        // 构造函数(String.. .配置文件) 可以填写一个或者多个
        // ioc di  不要忘了最后的 ;
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-01.xml");

        // 方式2: 先创建ioc容器对象,再指定配置文件,再刷新!
        //源码的配置过程!  创建容器[spring] 和  配置文件指定分开[自己指定]
        ClassPathXmlApplicationContext applicationContext1 = new ClassPathXmlApplicationContext();
        applicationContext1.setConfigLocations("spring-01.xml"); // 外部配置文件的设置
        applicationContext1.refresh(); // 调用ioc和di的流程


    }

    @Test
    public void getBeanFromIoC() {
        // 1. 创建ioc对象
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocations("spring-01.xml"); // 外部配置文件的设置
        applicationContext.refresh(); // 调用ioc和di的流程

        // 2. 读取ioc容器的组件
        Main main = applicationContext.getBean("main", Main.class);
        main.test();

        Main main1 = applicationContext.getBean(Main.class);
        main1.test();

        System.out.println(main == main1);   //同一个对象 单例 scope范围确定

    }


}
