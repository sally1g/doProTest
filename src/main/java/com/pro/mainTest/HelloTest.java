package com.pro.mainTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloTest {

	
	@RequestMapping("/hello3")
	public String HelloTest() {
		//model.addAttribute("data", "hello");
		return "hello";
	}
}
