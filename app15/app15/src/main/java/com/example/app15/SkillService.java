package com.example.app15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class SkillService {
	@Autowired
	
	private SkillRepository skillRepository;
	@PostMapping
	public Skill save(Skill skill) {
		return skillRepository.save(skill);
	}
	public Iterable<Skill>readAll(){
		return skillRepository.findAll();
	}

}
