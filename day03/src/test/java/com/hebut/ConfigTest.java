package com.hebut;


import com.hebut.config.JavaBeanConfig;
import com.hebut.controller.JavaController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(value = JavaBeanConfig.class)
public class ConfigTest {

    @Autowired
    private JavaController javaController;

    @Test
    public void test_Controller() {
        javaController.message();
        javaController.test1(1, 4);
        javaController.test2(2, 3);
    }

}
