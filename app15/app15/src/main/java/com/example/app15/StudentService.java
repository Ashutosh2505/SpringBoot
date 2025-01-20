package com.example.app15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	
	private StudentRepository studentRepository;
	
	public Student save(Student student) {
		return studentRepository.save(student);
	}
	public Iterable< Student> readAll(){
		return studentRepository.findAll();
	}

}
