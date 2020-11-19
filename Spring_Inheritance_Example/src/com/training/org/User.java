package com.training.org;

import java.util.ArrayList;

public class User {
  public String email;
  public String password;
  public  String phoneNumber;
  public  Address address;
  public boolean verified;
  public ArrayList<Role> roles;
  public boolean enabled;
  
  
 public User() {
	 this.email="";
	 this.password="";
	 this.phoneNumber="";
	 address= new Address();
	 this.verified=false;
	 this.enabled=true;
	 roles = new ArrayList<Role>();
 }
 public User(String email, String password, String phoneNumber, Address address, boolean verified, ArrayList<Role> roles,
		boolean enabled) {
	super();
	this.email = email;
	this.password = password;
	this.phoneNumber = phoneNumber;
	this.address = address;
	this.verified = verified;
	this.roles = roles;
	this.enabled = enabled;
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
}



public String getPassword() {
	return password;
}



public void setPassword(String password) {
	this.password = password;
}



public String getPhoneNumber() {
	return phoneNumber;
}



public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}



public Address getAddress() {
	return address;
}



public void setAddress(Address address) {
	this.address = address;
}



public boolean isVerified() {
	return verified;
}



public void setVerified(boolean verified) {
	this.verified = verified;
}



public ArrayList<Role> getRoles() {
	return roles;
}



public void setRoles(ArrayList<Role> roles) {
	this.roles = roles;
}



public boolean isEnabled() {
	return enabled;
}



public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}



@Override
public String toString() {
	return "User [email=" + email + ", password=" + password + ", phoneNumber=" + phoneNumber + ", address=" + address
			+ ", verified=" + verified + ", enabled=" + enabled + "]";
}

 
 
}
