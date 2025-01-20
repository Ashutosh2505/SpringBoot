package com.example.app12;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Integer> {

	@Query("select new com.example.app12.PersonDTO(p.email,p.address)from Person p")
	public Iterable<PersonDTO> read1();
}
