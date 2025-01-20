package com.example.app11;

import java.io.Serializable;

public class EmployeePK implements Serializable {

	private String firstName;
	private String lastname;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
        
	
}
