package com.example.app15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("student")
public class StudentController {
	@Autowired
	
	private StudentService studentService;
	
	@PostMapping
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	}
   public Iterable<Student>readAll(){
	   return studentService.readAll();
   }
	
}
