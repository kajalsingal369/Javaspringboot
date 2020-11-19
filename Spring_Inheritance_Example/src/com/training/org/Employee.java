package com.training.org;

public class Employee extends Person{
private int empId=0;


public Employee(String name, int empId) {
	super(name);
	this.empId = empId;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + "]";
}
}
