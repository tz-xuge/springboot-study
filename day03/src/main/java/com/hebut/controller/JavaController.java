package com.hebut.controller;

import com.hebut.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class JavaController {

    @Autowired
    private Calculator calculator;

    public void test1(int x, int y) {
        calculator.add(x, y);
    }

    public void test2(int x, int y) {
        calculator.multiply(x, y);
    }

    public void message() {
        calculator.user();
    }

}
