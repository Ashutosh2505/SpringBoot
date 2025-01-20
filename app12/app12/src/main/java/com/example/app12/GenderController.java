package com.example.app12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gender")
public class GenderController {
	
	@Autowired
	private GenderRepository genderRepository;
	
	@PostMapping
	public ResponseEntity<Gender> save(@RequestBody Gender gender){
		return ResponseEntity.ok(gender);
	}
	

}
