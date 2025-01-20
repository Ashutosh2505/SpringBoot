package com.example.app14;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Person {

	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	@OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
	private Set<MailAccount> mailAccounts = new HashSet<MailAccount>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Set<MailAccount> getMailAccounts() {
		return mailAccounts;
	}
	public void setMailAccounts(Set<MailAccount> mailAccounts) {
		this.mailAccounts = mailAccounts;
	}
	

}