package com.training.org;

public class CustomerType {
 String customerType;
 
 public CustomerType() {
	 this.customerType="";
 }
 
public CustomerType(String customerType) {
	super();
	this.customerType = customerType;
}

public String getCustomerType() {
	return customerType;
}

public void setCustomerType(String customerType) {
	this.customerType = customerType;
}

@Override
public String toString() {
	return "CustomerType [customerType=" + customerType + "]";
}
 
}
