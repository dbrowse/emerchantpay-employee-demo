package com.luv2code.springboot.thymeleafdemo.junitTests;


import static org.assertj.core.api.Assertions.assertThat;

import com.luv2code.springboot.thymeleafdemo.controller.EmployeeController;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SmokeTestJava {

    @Autowired
    private EmployeeController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}