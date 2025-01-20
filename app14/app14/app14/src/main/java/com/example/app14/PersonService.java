package com.example.app14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public Person save(Person person) {
	for (MailAccount mailAccount : person.getMailAccounts()) {
		mailAccount.setPerson(person);
	} 
	// reading every mail account throw Foreach loop.
		return personRepository.save(person);
	}
	
	public Iterable<Person> readAll() {
		return personRepository.findAll();
	}
}