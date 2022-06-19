package com.pro.dog.domain;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Hello {
	
	@RequestMapping("/hello")
	public String HelloTest() {
		//model.addAttribute("data", "hello");
		return "hello";
	}

}
