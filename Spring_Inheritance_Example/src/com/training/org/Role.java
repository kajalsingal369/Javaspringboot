package com.training.org;

public class Role {
  String designation;
  
  
  public Role() {
	  this.designation="";
  }


@Override
public String toString() {
	return "Role [designation=" + designation + "]";
}


public String getDesignation() {
	return designation;
}


public void setDesignation(String designation) {
	this.designation = designation;
}


public Role(String designation) {
	super();
	this.designation = designation;
}
}
