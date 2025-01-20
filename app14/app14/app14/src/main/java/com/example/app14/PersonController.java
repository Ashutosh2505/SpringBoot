package com.example.app14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping
	public Person save(@RequestBody Person person) {
		return personService.save(person);
	}
	

	public Iterable<Person> readAll() {
		return personService.readAll();
	}
}