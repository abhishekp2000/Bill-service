package com.example.Billservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BillServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(BillServiceApplication.class, args);
		System.out.println("Bill is running");
	}

}