package com.example.app8;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("t1")
	public String test1() {
		System.out.println("from test1");
		return "I am from test1";
		
	}
	
	@GetMapping("t2")
	public String test2() {
		System.out.println("from test2");
		return "I am from test2";
		
	}
	@PostMapping("t3")
	public String test3() {
		System.out.println("from test3");
		return "I am from test3";
		
	}
	@DeleteMapping("t4")
	public String test4() {
		System.out.println("from test4");
		return "I am from test4";
		
	}
	@PatchMapping("t5")
	public String test5() {
		System.out.println("from test5");
		return "I am from test5";
		
	}
	

}
