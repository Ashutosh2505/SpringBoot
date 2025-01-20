package com.example.app9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController{
	@Autowired
	private PersonRepository personRepository;
	@PostMapping
	public Person save(@RequestBody Person person) {
		return  personRepository.save(person);
	}
	@GetMapping("count")
	public long Count() {
		return personRepository.count();
	}
	@DeleteMapping("/personId")
	public Person delete(@RequestBody Person person) {
		personRepository.delete(person);
		return person;
	}

	
}
	
	
	
	
	/*
	  {
	 "personId": 101,
	 "firstName":"ramu",
	 "lastName": "xyz",
	 "age":22
	 }
	 */




