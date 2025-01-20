//@PathVariable Parameters:-
//The @PathVariable annotation extracts values from the URL and binds them to method parameters.



package com.example.app2;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
@RequestMapping("s1")
	public void hello1() {
		System.out.println("from hello1");
		// http://localhost:9091/s1
	}

@RequestMapping("s2/{param1}")
public String hello2(@PathVariable String param1) {
   System.out.println("from hello2 :" + param1);
   return "this is your input:" + param1;
   // http://localhost:9091/s2/abc
   }

@RequestMapping("s3/{param1}/{age}")
public String hello3(@PathVariable String param1 , @PathVariable Integer age) {
   System.out.println("from hello3 :" + param1 + ","+ age);          
   return "this is your input:" + param1 + "," + age;
   // http://localhost:9091/s3/abc/34
   }
@RequestMapping("s23/{firstName}/{lastName}/{age}")
public String hello23(@PathVariable String firstName,
		              @PathVariable Integer age,
		              @PathVariable String lastName) {
   System.out.println("from hello23 :" + firstName + ","+ lastName + ","+age);          
   return "this is your input:" + firstName + ","+lastName +"," + age;
   // http://localhost:9091/s23/abc/xyz/34
   }
@RequestMapping("s24/firstName/{firstName}/lastName/{lastName}/age/{age}")
public String hello24(@PathVariable String firstName,
		              @PathVariable Integer age,
		              @PathVariable String lastName) {
   System.out.println("from hello24 :" + firstName + ","+ lastName + ","+age);          
   return "this is your input:" + firstName + ","+lastName +"," + age;
   // http://localhost:9091/s24/firstName/abc/lastName/xyz/age/34
   }
//@RequestMapping("s25/firstName/{param1}/lastName/{param2}/age/{age}")
//public String hello25(@PathVariable String firstName,
//		              @PathVariable Integer age,
//		              @PathVariable String lastName) {
//   System.out.println("from hello25 :" + firstName + ","+ lastName + ","+age);          
//   return "this is your input:" + firstName + ","+lastName +"," + age;
//   // http://localhost:9091/s25/firstName/abc/lastName/xyz/age/34
//}
@RequestMapping("s25/firstName/{param1}/lastName/{param2}/age/{age}")
public String hello25(@PathVariable("param1") String firstName,
		              @PathVariable Integer age,
		              @PathVariable ("param2") String lastName) {
   System.out.println("from hello25 :" + firstName + ","+ lastName + ","+age);          
   return "this is your input:" + firstName + ","+lastName +"," + age;
   // http://localhost:9091/s25/firstName/abc/lastName/xyz/age/34
}
@RequestMapping("s26/firstName/{param1}/lastName/{param2}/age/{age}")
public String hello26(@PathVariable(value = "param1") String firstName,
		              @PathVariable Integer age,
		              @PathVariable (value = "param2") String lastName) {
   System.out.println("from hello26 :" + firstName + ","+ lastName + ","+age);          
   return "this is your input:" + firstName + ","+lastName +"," + age;
   // http://localhost:9091/s26/firstName/abc/lastName/xyz/age/34
}
@RequestMapping("s27/firstName/{param1}/lastName/{param2}/age/{age}")
public String hello27(@PathVariable(name = "param1") String firstName,
		              @PathVariable Integer age,
		              @PathVariable (name = "param2") String lastName) {
   System.out.println("from hello27 :" + firstName + ","+ lastName + ","+age);          
   return "this is your input:" + firstName + ","+lastName +"," + age;
   // http://localhost:9091/s27/firstName/abc/lastName/xyz/age/34
}
@RequestMapping("s28/{param1}")
public String hello28(@PathVariable(name = "param1") String firstName) {
   System.out.println("from hello28 :" + firstName );          
   return "this is your input:" + firstName ;
   // http://localhost:9091/s28/abc
}
@RequestMapping("s29/{param1}")
public String hello29(@PathVariable(required = false) String firstName) {
   System.out.println("from hello29 :" + firstName );          
   return "this is your input:" + firstName ;
   // http://localhost:9091/s29  ===> 404
   // http://localhost:9091/s29/abc  ===> correct
}
@RequestMapping("s30")
public String hello30(@PathVariable(required = false) String firstName) {
   System.out.println("from hello30 :" + firstName );          
   return "this is your input:" + firstName ;
   // http://localhost:9091/s30 
}
//@RequestMapping("s31")
//public String hello31(@PathVariable() String firstName) {
//   System.out.println("from hello30 :" + firstName );          
//   return "this is your input:" + firstName ;
//   // http://localhost:9091/s31 
//}
@RequestMapping("s32")
public String hello32(@PathVariable(required = false) Integer age) {
   System.out.println("from hello32 :" + age );          
   return "this is your input:" + age ;
   // http://localhost:9091/s32 
  }
@RequestMapping("s33")
public String hello33(@PathVariable(required = false) int age) {
   System.out.println("from hello33 :" + age );          
   return "this is your input:" + age ;
   // http://localhost:9091/s33 
    }  
}