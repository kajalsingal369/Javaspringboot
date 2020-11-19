package com.training.org;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class CommandLineRunnerExampleApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		System.out.println("SpringApplicationBuilder is called");
		return application.sources(CommandLineRunnerExampleApplication.class);
	}
	public static void main(String[] args) throws Exception {
		System.out.println("Main is called");
		SpringApplication.run(CommandLineRunnerExampleApplication.class, args);
	}
	@Bean
	public ApplicationStartupRunner schedulerRunner() {
		System.out.println("schedulerRunner is called");
		return new ApplicationStartupRunner();
	}


}	

