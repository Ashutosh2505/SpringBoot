package com.example.app4;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PersonController {
	@RequestMapping("p1")
	public String save(@RequestBody Person person) {
		System.out.println("from save method");
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		return "success";
	}
	//http://localhost:9090/p1

	
	/*
	 {
	 
    "firstName": "abc",
    "lastName": "xyz"
    
    }
	  
	  
	 */
}
