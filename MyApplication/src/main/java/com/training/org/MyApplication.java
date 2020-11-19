package com.training.org;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class MyApplication {
	
	@RequestMapping("/getcustomer")
	public Customer customer(@RequestParam(value="id",defaultValue = "101") int id) {
		return new Customer(id,"kajal");
	}
	@RequestMapping("/getcustomerall")
	public List<CustomerList> getCustList(){
		List<CustomerList> eList=new ArrayList<CustomerList>();

		eList.add(new CustomerList(101,"Eshan","HYD"));
		eList.add(new CustomerList(102,"tanisha","VJA"));
		eList.add(new CustomerList(103,"komal","DELHI"));
		

		return eList;


	}

	

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}
