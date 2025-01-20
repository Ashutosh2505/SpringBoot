package com.example.app12;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	@Query( "select new com.example.app12.CustomerDTO(c.firstName, " + 
				"c.lastName, g.name) from Customer c inner join Gender g on " + 
				"(c.genderId = g.id)")
	public List<CustomerDTO> readAllEmployee();
	
	@Query("select new com.example.app12.CustomerDTO(c.firstName, " + 
			"c.lastName, g.name, educ.name) from Customer c inner join Gender g on " + 
			"(c.genderId = g.id) inner join Education educ on (c.educationId = educ.id)")
	public List<CustomerDTO> readAllEmployee1();
}