package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class EmployeesAccountingApplication {

	public static void main(String[] args) {
		System.out.println("Hello Java!");

		SpringApplication.run(EmployeesAccountingApplication.class, args);
	}
}
