package com.pro.dog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@ComponentScan(basePackages = {"com.pro.dog","com.pro.mainTest"})
public class DogProTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DogProTestApplication.class, args);
	}

	
	@RequestMapping("/hello2")
	public String HelloTest() {
		//model.addAttribute("data", "hello");
		return "hello";
	}
}
