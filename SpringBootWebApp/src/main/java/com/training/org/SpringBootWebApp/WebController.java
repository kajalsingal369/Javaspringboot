package com.training.org.SpringBootWebApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	private List<String> newNames= Arrays.asList("tanisha","Manish","Rajesh","Anita");
	private static List<Person> perList=new ArrayList<Person>();
	static {
		perList.add(new Person("Anish","Madake"));
		perList.add(new Person("Tanish","Patil"));
	}
	@RequestMapping(value = "/mypage")
	public String index(Model model) {
		return "index";
	}
	@RequestMapping(value = "/greet")
	public String greet(Model model) {
		model.addAttribute("name","Eshan");
		model.addAttribute("names",newNames);
		return "greet";
	}
	@RequestMapping(value = "/person")
	public String personDetails(Model model) {
		model.addAttribute("person",perList);
		return "person";
	}
	@RequestMapping(value = "/Signin")
	public String Signin() {
		return "signin";
	}
	@RequestMapping(value = "/SignUp")
	public String Signup() {
		return "signup";
	}
	@RequestMapping("/myform")
	public String getForm() {
		return "MyForm";
	}

	@RequestMapping("/result")
	public String getMyForm(@ModelAttribute MyForm myform, Model model) {
		model.addAttribute("form",myform);
		System.out.println(myform.getMessage());
		model.addAttribute("id",myform.getId());
		model.addAttribute("message",myform.getMessage());
		return "result";

	}

}


