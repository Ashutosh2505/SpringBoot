package com.example.app4;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
	@RequestMapping("s1")
	public String studentSave(@RequestBody Student student) {
		System.out.println("from studentSave");
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getAge());
		System.out.println(student.getMobileNumber());
		return "success from student save";
		
	}
	
	/*
	   "firstName":"abc",
	   "lastName" :"xyz",
	   "age": 22;
	   "mobileNumber": 9844744579
	 
	 
	 
	 */

}
