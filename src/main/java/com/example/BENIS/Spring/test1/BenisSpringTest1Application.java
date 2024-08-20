package com.example.BENIS.Spring.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BenisSpringTest1Application {

	/*public static void main(String[] args) {
		SpringApplication.run(BenisSpringTest1Application.class, args);
	}*/





	public static void main(String[] args) {
		try {
			SpringApplication.run(BenisSpringTest1Application.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
