package com.hebut;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl1 implements UserService {
    @Override
    public void show() {
        System.out.println("I'm show2");
    }

    @Override
    public void test() {
        System.out.println("I'm test2");
    }
}
