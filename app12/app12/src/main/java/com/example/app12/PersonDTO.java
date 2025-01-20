package com.example.app12;

public class PersonDTO {
	private String email;
	private String address;
	public PersonDTO(String email, String address) {
		super();
		this.email = email;
		this.address = address;
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
