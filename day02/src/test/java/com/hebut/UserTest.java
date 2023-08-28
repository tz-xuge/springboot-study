package com.hebut;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    @Test
    public void testIoC() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserController userController = applicationContext.getBean(UserController.class);

        // 1. ioc 容器中只有一个 UserService 接口对应的实现类对象！
        userController.show();

        // 2: ioc容器没有默认的类型如何处理
        //@Autowired使用它进行装配，【默认】情况下至少要求有一个bean !否则报错!可以指定佛系装配

        // 3:同一个类型有多个对应的组件@Autowired也会报错!无法选择!!
        //解决1:成员属性名指定@Autowired 多个组件的时候，默认会根据成员属性名查找
        //解决2: @Qualifier(vaLue = "userServiceImpl"")使用该注解指定获取bean的id!不能单独使用必须配合Autowired
        //优化点:@Autowired(required = true)+ @Qualifier(value = "userServiceImpl) = @Resource(name="")


    }

}
