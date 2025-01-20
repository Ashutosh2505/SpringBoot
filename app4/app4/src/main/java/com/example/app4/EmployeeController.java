package com.example.app4;

import java.util.Arrays;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@RequestMapping("e1")
	public Employee save(@RequestBody Employee emp) {
		System.out.println(emp.getFirstName());
		System.out.println(emp.getLastName());
		System.out.println(emp.getAge());
		System.out.println(emp.getMobileNos());
		System.out.println(emp.getProjects());
		System.out.println(emp.getEducations());
		System.out.println(Arrays.toString(emp.getEmailsIds()));
		System.out.println(emp.getAddress().getHouseNo());
		System.out.println(emp.getAddress().getStreetName());
		return emp;
		
		/* 
		 
	 "firstName":"abc",
		"lastName":"xyz",
		"age":22,
		"emailIds":["abc@abc.com","abc@xyz.com"], 
		"moblieNos":[984509845,984509846],        
		"projects":["lms","e-commerce","banking"], 
		"educations":{"pg":"ME","degree":"BE"},
		"address":
		{"houseNo":"123/M",
		"streetName":"BTM"}
*/
		    
		    
		    
		    
		 
	}

}
