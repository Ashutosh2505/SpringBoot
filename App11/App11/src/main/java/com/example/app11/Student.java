package com.example.app11;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="std_student", uniqueConstraints = {@UniqueConstraint(columnNames = {"firstName", "lastName"}),
		                                        @UniqueConstraint(columnNames = "age")})
public class Student {
	@Id
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;

}