package com.example.app12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("education")
public class EducationController {
	
	@Autowired
	private  EducationRepository educationRepository;
	
	@PostMapping
	public ResponseEntity<Education> save(@RequestBody Education education){
		return ResponseEntity.ok(education);
		
	}

}
