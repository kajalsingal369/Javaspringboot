package com.training.org;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	@RequestMapping("/")
	public String printHello(ModelMap model) {
		return "HelloWorld";
	}
}
