package com.training.org;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

public class ApplicationStartupRunner implements CommandLineRunner{
	protected final Log logger=LogFactory.getLog(getClass());
	@Override
	public void run(String... args) throws Exception {
		logger.info("ApplicaitonStartupRunner run method is started");

	}
}

@Order(value=3)
@Component
class ApplicationStartupRunnerOne implements CommandLineRunner {
	protected final Log logger = LogFactory.getLog(getClass());
	@Autowired
	private HelloMessageService helloMessageService;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(helloMessageService.getMessage());
		System.out.println("ApplicationStartupRunnerOne is called");
		logger.info("ApplicationStartupRunnerOne run method Started !!");
	}
}





@Order(value=2)
@Component
class ApplicationStartupRunnerTwo implements CommandLineRunner {
	protected final Log logger = LogFactory.getLog(getClass());
	@Override
	public void run(String... args) throws Exception {


		System.out.println("ApplicationStartupRunnerTwo is called");
		logger.info("ApplicationStartupRunnerTwo run method Started !!");
	}
}

