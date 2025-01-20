package com.example.app12;

public class CustomerDTO {
	private String firstName;
	private String lastName;
	private String gendertName;
	private String educationName;
	public CustomerDTO(String firstName, String lastName, String gendertName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gendertName = gendertName;
	}
	public CustomerDTO(String firstName, String lastName, String gendertName, String educationName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gendertName = gendertName;
		this.educationName = educationName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGendertName() {
		return gendertName;
	}
	public void setGendertName(String gendertName) {
		this.gendertName = gendertName;
	}
	public String getEducationName() {
		return educationName;
	}
	public void setEducationName(String educationName) {
		this.educationName = educationName;
	}
	

}
