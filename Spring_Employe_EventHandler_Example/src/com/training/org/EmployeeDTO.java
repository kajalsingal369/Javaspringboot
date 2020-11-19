package com.training.org;

public class EmployeeDTO {
	private Integer id;
	private String FirstName;
	private String LastName;
	private String designation;

	public EmployeeDTO() {
		System.out.println(" Default constructor is called");
		this.id=0;
		this.FirstName="";
		this.LastName="";
		this.designation="";
	}

	public EmployeeDTO(Integer id, String firstName, String lastName, String designation) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.designation = designation;
	}
  
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", designation="
				+ designation + "]";
	}
	
	
}
