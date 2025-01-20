package com.example.app8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello"  )
public class Test1Controller {
	
	@GetMapping
	public String test20() {
		System.out.println("test20");
		return "from test20";
	}
	@RequestMapping("t1")
		public String test1() {
			System.out.println("from test1");
			return "I am from test1";
			
		}
	@RequestMapping("t22")
		public String test22() {
			System.out.println("from test 22");
			return "I am from test22";
			
		}
	

}
