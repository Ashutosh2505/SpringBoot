package com.example.app1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String firstName;
	private String lastName;
	private Integer age;
	private String[] emailIds;
	private List<Integer> moblieNos; 
	private Set<String> projects;
	private Map<String, String> educations;
	private Address address;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String[] getEmailIds() {
		return emailIds;
	}
	public void setEmailIds(String[] emailIds) {
		this.emailIds = emailIds;
	}
	public List<Integer> getMoblieNos() {
		return moblieNos;
	}
	public void setMoblieNos(List<Integer> moblieNos) {
		this.moblieNos = moblieNos;
	}
	public Set<String> getProjects() {
		return projects;
	}
	public void setProjects(Set<String> projects) {
		this.projects = projects;
	}
	public Map<String, String> getEducations() {
		return educations;
	}
	public void setEducations(Map<String, String> educations) {
		this.educations = educations;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}