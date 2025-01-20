package com.example.app11;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
	
	public Iterable<Person> findAllByFirstName(String arg);
    public Iterable<Person> findByEmail(String email);
    
    public Iterable<Person> findAllByFirstNameOrLastName(String fn , String LastName);
    public Iterable<Person> findAllByFirstNameOrEmail(String fn , String arg2);
    public Iterable<Person> findAllByAgeOrAddress(Integer arg1 , String arg2);
    
    
    public Iterable<Person> findAllByFirstNameAndLastName(String fn , String LastName);
    public Iterable<Person> findAllByFirstNameAndEmail(String fn , String arg2);
    public Iterable<Person> findAllByAgeAndAddress(Integer arg1 , String arg2);
    
    public Iterable<Person> findAllByFirstNameLike(String fn );
    public Iterable<Person> findAllByEmailLike(String fn);
    public Iterable<Person> findAllByAddressLike(Integer arg1);
    
    public Iterable<Person> findAllByAgeGreaterThan(Integer arg1);
    public Iterable<Person> findAllByAgeLessThan(Integer arg1);
    
    @Query("select firstName from Person")
    public String[] read1();
    
    @Query("select age from Person")
    public Integer[] read2();
    
    @Query("select firstName, age from Person")
    public Iterable<Object[]> read3();
    
    @Query("select firstName, age, lastName, email from Person")
    public Iterable<Object[]> read4();
    
    @Query("from Person")
    public Iterable<Person> read5();
    
    @Query("from Person where firstName = ?1")
    public Iterable<Person> read6(String fn);
    
    @Query("from Person where firstName = ?1 or lastName = ?2")
    public Iterable<Person>read7(String fn, String arg);
    
    @Query("from Person where firstName = :fn or lastName = :arg")
    public Iterable<Person>read8(String fn, String arg);
    
    @Query("from Person where age >:age or lastName = :ln")
    public Iterable<Person> read9(Integer age, String ln);
    
    @Query(value = "select * from Person",nativeQuery = true)
    public Iterable<Person>read10();
    
    @Query(value = "select * from Person where first_name  = :arg",nativeQuery = true)
    public Iterable<Person> read11(String arg);
    
    @Query(value = "select * from Person where person_age = ?1",nativeQuery = true)
    public Iterable<Person> read12(Integer age);
    
    
}





