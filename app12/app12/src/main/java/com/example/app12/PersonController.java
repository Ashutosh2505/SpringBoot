package com.example.app12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;
	
	@PostMapping
	public ResponseEntity<PersonSaveVAO>save(@RequestBody Person person){
		PersonSaveVAO vao = new PersonSaveVAO();
		vao.setMessage("there is db error while saving");
		personRepository.save(person);
		vao.setMessage("saved successfully");
		vao.setStatus(true);
	return ResponseEntity.ok(vao);
	}
	@GetMapping("/read")
	public ResponseEntity<Iterable<PersonDTO>> read() {	
    return ResponseEntity.ok(personRepository.read1());
    /*
    {
         "id": 7,
	 	"firstName": "Ramu",
		"lastName": "abc",
		"age": 22,
		"email": "r@r.com",
		"address": "BTM"
	}
	
	url: http://localhost:9090/person/read
	
	*/
}
	
}

/*. 
//Key Components
PersonRepository:

Manages the interaction with the database for Person entities.
PersonSaveVAO:

A custom value object that holds the status and message for the save method.
PersonDTO:

A Data Transfer Object (DTO) representing a simplified version of Person for the read method.//
*/
