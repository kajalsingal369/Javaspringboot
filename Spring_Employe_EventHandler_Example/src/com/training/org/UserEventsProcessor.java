package com.training.org;

import org.springframework.context.ApplicationListener;

public class UserEventsProcessor implements ApplicationListener<EmployeeEvent>{
	
  public void onApplicationEvent(EmployeeEvent event) {
	EmployeeEvent employeeEvent=(EmployeeEvent) event;
	 System.out.println("Employee"+employeeEvent.getEventType()+"With Details"+employeeEvent.getEmployee());
}
}