package com.example.app13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {
	
	@Autowired  // dependency Injection -- Injects the PersonRepository bean, enabling database operations.
	private PersonService personService;
	
	@PostMapping
	public ResponseEntity<Person> save(@RequestBody Person person) {
		person.getAddress().setPerson(person);
		return ResponseEntity.ok(personService.save(person));
	}
	
	public ResponseEntity<Iterable<Person>> list(){
		return ResponseEntity.ok(personService.list());
	}
	
}