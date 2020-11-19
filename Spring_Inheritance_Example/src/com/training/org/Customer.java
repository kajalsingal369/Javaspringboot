package com.training.org;
 import java.util.*;
 
public class Customer extends User {
 private String forename;
 private String surname;
 private CustomerType customerType;
  ArrayList<PaymentDetails> paydetails;
  ArrayList<Bookable> booking;
  

 public Customer() {
	 this.forename="";
	 this.surname="";
	 paydetails= new ArrayList<PaymentDetails>();
	 booking = new ArrayList<Bookable>();
	 customerType= new CustomerType();
 }
public Customer(String forename, String surname, ArrayList<PaymentDetails> paydetails, ArrayList<Bookable> booking,
		CustomerType customerType) {
	super();
	this.forename = forename;
	this.surname = surname;
	this.paydetails = paydetails;
	this.booking = booking;
	this.customerType = customerType;
}
public String getForename() {
	return forename;
}
public void setForename(String forename) {
	this.forename = forename;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public ArrayList<PaymentDetails> getPaydetails() {
	return paydetails;
}
public void setPaydetails(ArrayList<PaymentDetails> paydetails) {
	this.paydetails = paydetails;
}
public ArrayList<Bookable> getBooking() {
	return booking;
}
public void setBooking(ArrayList<Bookable> booking) {
	this.booking = booking;
}
public CustomerType getCustomerType() {
	return customerType;
}
public void setCustomerType(CustomerType customerType) {
	this.customerType = customerType;
}
@Override
public String toString() {
	return "Customer [forename=" + forename + ", surname=" + surname + ", customerType=" + customerType + "]";
}
 
}