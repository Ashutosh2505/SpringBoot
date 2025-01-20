package com.example.app12;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping
	public ResponseEntity<Customer> save(@RequestBody Customer customer) {
		return ResponseEntity.ok(customerRepository.save(customer));
	}
	
	@GetMapping("read")
	public ResponseEntity<Iterable<Customer>> read1() {
		return ResponseEntity.ok(customerRepository.findAll());
	}
	
	@GetMapping("read1")
	public ResponseEntity<Iterable<CustomerDTO>> readAllEmployees() {
		return ResponseEntity.ok(customerRepository.readAllEmployee());
	}
	
	@GetMapping("read2")
	public ResponseEntity<Iterable<CustomerDTO>> readAllEmployees1() {
		return ResponseEntity.ok(customerRepository.readAllEmployee1());
	}
}