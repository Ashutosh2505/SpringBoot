package com.example.app14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MailAccountService {
	
	@Autowired
	private MailAccountRepository mailAccountRepository;
	
	public MailAccount save(MailAccount mailAccount) {
		return mailAccountRepository.save(mailAccount);
	}
	
	public Iterable <MailAccount> readAll() {
		return mailAccountRepository.findAll();
	}
}