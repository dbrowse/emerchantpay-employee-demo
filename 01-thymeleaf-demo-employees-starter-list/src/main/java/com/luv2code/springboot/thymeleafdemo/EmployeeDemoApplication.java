package com.luv2code.springboot.thymeleafdemo;

import com.luv2code.springboot.thymeleafdemo.pageObjects.EmployeesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(EmployeeDemoApplication.class, args);



	}

}
