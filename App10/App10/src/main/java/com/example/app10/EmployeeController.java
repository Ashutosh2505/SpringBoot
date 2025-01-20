package com.example.app10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employees")
public class EmployeeController{
	@Autowired
	private EmployeeRepository employeeRepository;
	 
	@PostMapping
	public ResponseEntity<Employee> save(@RequestBody Employee employee) {
		return ResponseEntity.ok(employeeRepository.save(employee));
	}
	@PostMapping("all")
	public ResponseEntity<Iterable<Employee>>saveAll(@RequestBody Iterable<Employee> employees) {
		return ResponseEntity.ok(employeeRepository.saveAll(employees));
	}
	@GetMapping("count")
	public ResponseEntity<Long>count(){
		return ResponseEntity.ok(employeeRepository.count());
	}
	
	@DeleteMapping("/{id}")
	public Integer delete(@PathVariable Integer id) {
		employeeRepository.deleteById(id);
		return id;
	}
	@DeleteMapping("all")
	public String deleteAll(){
		employeeRepository.deleteAll();
		return "successfully deleted all the records";
	}
	
}

//@RestController
//@RequestMapping("employee")
//public class EmployeeController {
//
//	@Autowired
//	private EmployeeRepository employeeRepository;
//	
//	@PostMapping
//	public ResponseEntity<Employee> save(@RequestBody Employee employee){
//		return ResponseEntity.ok(employeeRepository.save(employee));
//	}
//	/*
//	  http://localhost:9090/employee
//	 {
//	 	"firstName": "ramu",
//	 	"lastName": "abc"
//	 }
//	 */
//
//	@PostMapping("all")
//	public ResponseEntity<Iterable<Employee>> saveAll(@RequestBody Company company){
//		return ResponseEntity.ok(employeeRepository.saveAll(company.getEmployees()));
//	}
//	/*
//	 http://localhost:9090/employee/all
//	 method : POST
//	 JSON object:
//	  
//	 	{
//	 		"employees":[
//	 			{
//	 				"firstName": "ramu",
//					"lastName": "abc"
//				},
//				{
//					
//	 				"firstName": "manu",
//					"lastName": "abc"
//				},
//				{
//					
//	 				"firstName": "swathi",
//					"lastName": "abc"
//				}
//	 	  ]
//	 	}
//	 */
//	@GetMapping("count")
//	public ResponseEntity<Long> count(){
//		return ResponseEntity.ok(employeeRepository.count());
//	}
//	/*
//	 	http://localhost:9090/employee/count
//	 	method : GET
//	 */
//	
//	@GetMapping("/{id}")
//	public ResponseEntity<Employee> findById(@PathVariable Integer id){
//		Employee employee = null;
//		Optional<Employee> optional = employeeRepository.findById(id);
//		
//		
//		return optional.isPresent() ? ResponseEntity.ok(optional.get()):ResponseEntity.ok(employee);
//	}
//	/*
//	 	http://localhost:9090/employee/1
//	 	method : GET
//	 */
//	@PostMapping("read/ids")
//	public ResponseEntity<Iterable<Employee>> findAllByIds(@RequestBody Company company){
//		return ResponseEntity.ok(employeeRepository.findAllById(company.getEmployeeIds()));
//	}
//	/*
//	 	http://localhost:9090/employee/read/ids
//	 	method : POST
//	 	JSON obj:
//	 	{
//	 		"employeeIds": [1, 2, 3]
//	 	}
//	 */
//	@PostMapping("read/all")
//	public ResponseEntity<Iterable<Employee>> findAll(){
//		return ResponseEntity.ok(employeeRepository.findAll());
//	}
//	/*
//	 	http://localhost:9090/employee/read/all
//	 	method : GET
//	
//	 */
//}