package com.training.org;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.training.component")

public class HelloWorld {
public static void main(String[] args) {
	ApplicationContext context =SpringApplication.run(HelloWorld.class, args);
	String [] beanNames=context.getBeanDefinitionNames();
	Arrays.sort(beanNames);
	for(String name: beanNames) {
		System.out.println("-->  "+name);
	}
	
	
}
}
