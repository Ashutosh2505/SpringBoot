package com.example.app4;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private String firstName;
	private String lastName;
	private Integer age;
    private String[] emailsIds;
    private List<Integer> mobileNos;
    private Set<String> projects;
    private Map<String,String> educations;
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
	public String[] getEmailsIds() {
		return emailsIds;
	}
	public void setEmailsIds(String[] emailsIds) {
		this.emailsIds = emailsIds;
	}
	public List<Integer> getMobileNos() {
		return mobileNos;
	}
	public void setMobileNos(List<Integer> mobileNos) {
		this.mobileNos = mobileNos;
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
	private Address address;

}