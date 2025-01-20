package com.example.app3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
	
	@RequestMapping("t1")
	public String test1(@RequestParam String param1) {
	System.out.println("test1:" + param1);
	return "from webservice:"+ param1;
	}
	//http://localhost:9090/t1  ===>  400
	//http://localhost:9090/t1?param1=abc
	
	@RequestMapping("t2")
	public String test2(@RequestParam String param1,@RequestParam Integer age) {
	      System.out.println("test2:" + param1 + "," + age);
	      return "from webservice:"+ param1 + "," + age;
	}
	//http://localhost:9090/t2?param1=abc&age=34 // after ? is called query String..
	
	@RequestMapping("t3")
	public String test3(@RequestParam String param1,
			            @RequestParam Integer age,
			            @RequestParam String lastName) {
		System.out.println("test1:" + param1 + "," + age + "," + lastName);
		return "from webservice:" + param1 + ", " + age + "," + lastName;
	}
	
	//http://localhost:9090/t3?param1=John&age=30&lastName=Doe

	
	@RequestMapping("t14")
	public String test14(@RequestParam (name = "test") String param1) {
		System.out.println("test1:" + param1);
		return "from webservice:" + param1;
	}
	// http://localhost:9090/t14?test=abc
	
	@RequestMapping("t15")
	public String test15(@RequestParam (value = "hello") String firstName) {
		System.out.println("hello:" + firstName);
		return "from webservice:" + firstName;
	}
	// http://localhost:9090/t15?hello=ramu
	
	@RequestMapping("t16")
	public String test16(@RequestParam (defaultValue = "hello") String firstName) {
		System.out.println("hello:" + firstName);
		return "from webservice:" + firstName;
	}
	// http://localhost:9090/t16?firstName=ramu
	// http://localhost:9090/t16
	
//The defaultValue ensures that the method can handle requests even if the parameter is missing.
	
	//required = false: Makes the parameter optional, and its value will be null if not provided.
	//defaultValue: Specifies a default value if the parameter is not provided, avoiding null.
	
	@RequestMapping("t17")
	public String test17(@RequestParam (required = false) String firstName) {
		System.out.println("hello:" + firstName);
		return "from webservice:" + firstName;
	}
	// http://localhost:9090/t17?firstName=ramu
	// http://localhost:9090/t17
}