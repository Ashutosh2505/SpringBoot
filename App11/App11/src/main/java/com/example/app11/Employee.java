package com.example.app11;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class Employee {
	
	@EmbeddedId
	private EmployeePK empPK;
	private Integer age;
	private String email;
	private String address;
	public EmployeePK getEmpPK() {
		return empPK;
	}
	public void setEmpPK(EmployeePK empPK) {
		this.empPK = empPK;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	

}
