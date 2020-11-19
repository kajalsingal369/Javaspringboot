package com.training.org;
 
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
		context.start();
		HelloWorld obj=(HelloWorld)context.getBean("helloBean");
	    System.out.println(obj);
		obj.getMessage();
		context.stop();
	}

}
