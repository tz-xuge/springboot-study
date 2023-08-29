package com.hebut.service.impl;

import com.hebut.service.Calculator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl implements Calculator {

    @Override
    public void add(int i, int j) {

        System.out.println("i+j=" + (i + j));

    }

    @Override
    public void multiply(int i, int j) {

        System.out.println("i*j=" + (i * j));

    }

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Override
    public void user() {
        System.out.println("username is " + username);
        System.out.println("password is " + password);
    }
}
