package com.example.app15;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("skill")
public class SkillController {
	@Autowired
	private SkillService skillService;
	@PostMapping
	public Skill save(@RequestBody Skill skill) {
		return skillService.save(skill);
	}
	public Iterable<Skill> readAll(){
		return skillService.readAll();
	}

}
