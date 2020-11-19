package com.training.org;

public class CustomerList {
	private Integer empId;
	private String firstName;
	private String location;
	
	public CustomerList() {
		
	}

	public CustomerList(Integer empId, String firstName, String location) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.location = location;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "CustomerList [empId=" + empId + ", firstName=" + firstName + ", location=" + location + "]";
	}
	
}
