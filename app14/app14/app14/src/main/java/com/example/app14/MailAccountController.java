package com.example.app14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.ManyToOne;

@RestController
@RequestMapping("mail")
public class MailAccountController {

	@Autowired
	private MailAccountService mailAccountService;
	
	@PostMapping
	public MailAccount save(@RequestBody MailAccount mailAccount){
		return mailAccountService.save(mailAccount);
	}
	
	public Iterable<MailAccount> readAll(){
		return mailAccountService.readAll();
	}
	/*
	 * {
	 		"id": 1,
			"firstName": "abc",
			"lastName": "xyz"
		}
		
		for mailaccount
		
		{
			"id": 1,
			"username": "pqr",
			"password": "a@iuh",
			"person": {
				"id": 1
				}
		}
	 */
}