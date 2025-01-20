package com.example.app11;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository;//@Autowired on the personRepository field is used to inject the PersonRepository dependency into the class.
	//This is part of Spring’s Dependency Injection (DI) mechanism and helps reduce boilerplate code while making the application more modular and testable.
	
	@PostMapping
	 public ResponseEntity<Person> save(@RequestBody Person person) {
		return ResponseEntity.ok(personRepository.save(person));
	}
	/*
	 url: http://localhost:9090/person
	 method: POST
	 JSON Object
	 {
	 	"firstName": "Ramu",
		"lastName": "abc",
		"age": 22,
		"email": "r@r.com",
		"address": "BTM"
	}
	 */
	
	@GetMapping("/fn/{firstName}")
	 public ResponseEntity<Iterable<Person>> readBasedOnFirstName(@PathVariable String firstName) {
		return ResponseEntity.ok(personRepository.findAllByFirstName(firstName));
	}
	/*
	 	url		: 	http://localhost:9090/person/fn/Ramu
	 	method  : 	GET
	 	
	 */
	
	@PatchMapping("person1")
	public ResponseEntity<Iterable<Person>> create(@RequestBody Person person){
		return ResponseEntity.ok(personRepository.findAll());
	}
	/*
	 	url		:		http://localhost:9090/person/person1
	 	method	:		PATCH
	 	{
	 		"firstName": "Ramu",
			"lastName": "abc",
			"age": 22,
			"email": "r@r.com",
			"address": "BTM"
		}
	 */
	
	@GetMapping("/age/{age}")
	public ResponseEntity<Iterable<Person>> create2(@PathVariable Integer age){
		return ResponseEntity.ok(personRepository.findAllByAgeGreaterThan(age));
	}
	/*
	 	url		:		http://localhost:9090/person/age/22
	 	method	:		GET
	 */
	
	@GetMapping("/fn1/{firstName}")
	  public ResponseEntity<Iterable<Person>> readBasedOnFirstNameLike(@PathVariable String firstName){
		  return ResponseEntity.ok(personRepository.findAllByFirstNameLike("%" + firstName + "%"));
	  }
	
	@GetMapping("/fn2/{email}")
	public ResponseEntity<Iterable<Person>> readBasedOnEmailLike(@PathVariable String email){
		return ResponseEntity.ok(personRepository.findAllByEmailLike("%" + email + "%"));
	}
	
//	@GetMapping("/Add/{address}")
//	public ResponseEntity<Iterable<Person>> readBasedOnAddressLike(@PathVariable String address){
//	   return ResponseEntity.ok(personRepository.findAllByAddressLike("%" + address + "%"));	
//	}
	
	@GetMapping("/read1")
	public ResponseEntity<String[]>read1() {
		return ResponseEntity.ok(personRepository.read1());
	}
	
	@GetMapping("/read2")
	public ResponseEntity<Integer[]>read2(){
		return ResponseEntity.ok(personRepository.read2());
	}
	
	@GetMapping("/read3")
	public ResponseEntity<Iterable<Object[]>> read3() {
		return ResponseEntity.ok(personRepository.read3());
	}
	
	@GetMapping("/read4")
	public ResponseEntity<Iterable<Object[]>> read4() {
		return ResponseEntity.ok(personRepository.read4());
	}
	
	
	@GetMapping("/read5")
	public ResponseEntity<Iterable<Person>> read5() {
		return ResponseEntity.ok(personRepository.read5());
	}
	
	@GetMapping("/read6/{firstName}")
	public ResponseEntity<Iterable<Person>> read6(@PathVariable String firstName){
		return ResponseEntity.ok(personRepository.read6(firstName));
	}
	/*
 		url		:	http://localhost:9090/person/read6/Ramu
 		method	:	GET
	 */
	
	@GetMapping("/read7/{firstName}/{lastName}")
	public ResponseEntity<Iterable<Person>> read7(@PathVariable String firstName, @PathVariable String lastName){
		return ResponseEntity.ok(personRepository.read7(firstName, lastName));
	}
	/*
 		url		:	http://localhost:9090/person/read7/aaa
 		method	:	GET
	 */
	
	@GetMapping("/read8/{firstName}/{lastName}")
	public ResponseEntity<Iterable<Person>> read8(@PathVariable String firstName, String lastName){
		return ResponseEntity.ok(personRepository.read8(firstName, lastName));
	}
	/*
 		url		:	http://localhost:9090/person/read8/aaa
 		method	:	GET
	 */
	
	@GetMapping("/read9/{age}/{arg1}")
	public ResponseEntity<Iterable<Person>> read9(@PathVariable Integer age, @PathVariable String arg1){
		return ResponseEntity.ok(personRepository.read9(age, arg1));
	}
	
	@GetMapping("/read10")
	public ResponseEntity<Iterable<Person>> read10(){
		return ResponseEntity.ok(personRepository.read10());
	}
	
	@GetMapping("/read11/{arg}")
	public ResponseEntity<Iterable<Person>> read11(@PathVariable String arg){
		return ResponseEntity.ok(personRepository.read11(arg));
	}
	
	@GetMapping("/read12/{age}")
	public ResponseEntity<Iterable<Person>> read12(@PathVariable Integer age)
	{
		return ResponseEntity.ok(personRepository.read12(age));
	}
	
	
	
	
}