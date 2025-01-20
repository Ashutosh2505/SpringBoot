package com.example.app13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public Person save(Person person) {
		person.getAddress().setPerson(person);
		return personRepository.save(person);
	}
	
	public Iterable<Person>list(){
		return personRepository.findAll();
	}
	

}
