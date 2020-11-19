package com.training.org;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	private Qualification qualification;

	public Student() {
		System.out.println("Default constructor of Student is called");
	}
	
	public Student(Qualification qualification) {
		super();
		this.qualification = qualification;
	}

	public Qualification getQualification() {
		return qualification;
	}

	@Autowired
	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	@Override
	public String toString() {
		return "Student [qualification=" + qualification + "]";
	}

	
}




/*package com.training.org;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String name;
	private int age;
	private Qualification qualification;
	
	public Student() {
		System.out.println(" default construction of student is called");
	}
	
	public Student(String name, int age, Qualification qualification) {
		super();
		this.name = name;
		this.age = age;
		this.qualification = qualification;
	}
	
	public String getName() {
		return name;
	}
	
	

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	@Required
	public void setName(String name) {
		System.out.println("setName is called");
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	@Required
	public void setAge(int age) {
		System.out.println("setAge is called");
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", qualification=" + qualification + "]";
	}
}*/
