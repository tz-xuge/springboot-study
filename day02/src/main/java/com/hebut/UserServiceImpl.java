package com.hebut;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private Integer age = 19;

    @Value("root")
    private String name;
    // 上面两种方式一样   一般不同value

    // @Value("${jdbc.password:123}")   引用外部文件 有jdbc.password赋值   没有赋值123
    @Value("${jdbc.password:123}")
    private String password;

    @Override
    public void show() {
        System.out.println("I'm show1");
    }

    @Override
    public void test() {
        System.out.println("I'm test1");
        System.out.println(password);
    }
}
