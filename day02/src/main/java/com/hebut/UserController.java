package com.hebut;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

//    // 自动装配注解DI
//    @Autowired
//    private UserService userService;

    @Autowired
    @Qualifier("userServiceImpl")   // 类名首字母小写 ！！！
    private UserService userService;

//    @Resource(name = "userServiceImpl1")  // 注意格式
//    private UserService userService1;

    public void show() {
        userService.show();
        userService.test();
    }

}
