package com.training.org;
import java.util.*;

public class Employee {
	
	private Integer empId;
	private String name;
	private double salary;
	private Address address;
	private List<String> technologies;
	private List<Project> projects;

	
    public Employee() {
		System.out.println("Default constructor of Employee is called");
		empId=0;
		name="";
		salary=0;
		address= new Address();
		technologies = new ArrayList<String>();
		projects = new ArrayList<Project>();
	}
	
	

	public Employee(Integer empId, String name, double salary, Address address, List<String> technologies,List<Project> projects) {
		System.out.println("Parameterised constructor of Employee is called");
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		address =new Address();
		technologies= new ArrayList<String>();
		this.projects = projects;
	}
	
	
	public List<Project> getProject() {
		return projects;
	}



	public void setProject(List<Project> projects) {
		this.projects = projects;
	}
	
	
	public List<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public Integer getEmpId() {
		return empId;
	}
	
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setAddress(Address address) {
		this.address= address;
	}
	
	
	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", technologies=" + technologies + ", projects=" + projects + "]";
	}

}

