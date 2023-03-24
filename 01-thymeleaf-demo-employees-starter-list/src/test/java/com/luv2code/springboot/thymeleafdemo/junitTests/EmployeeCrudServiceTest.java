package com.luv2code.springboot.thymeleafdemo.junitTests;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource("/application.properties")
@SpringBootTest
public class EmployeeCrudServiceTest {

    @Test
    public void createEmployeeService() {
        //set up - Create instance ot the class to test

        //execute - Call the method you need to test


        //assert - Check the result and verify that is the expected result

    }

}
