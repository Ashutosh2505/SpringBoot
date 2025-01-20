package com.example.app8;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseEntityController {
	
	@RequestMapping("services1")
	public ResponseEntity<String> services() {
		ResponseEntity<String> responseEntity = 
				new ResponseEntity("success",HttpStatus.OK);
		return responseEntity ;
	}
	@RequestMapping("services2")
	public ResponseEntity<List<String>> service2(){
		List<String>list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		list.add("hello");
		ResponseEntity<List<String>> responseEntity =
				new ResponseEntity<List<String>>(list,HttpStatus.OK);
		return responseEntity;	
	}
	@RequestMapping("service3")
	public ResponseEntity<Person> service3() {
		Person  person = new Person();
		person.setFirstName("abc");
		person.setAge(22);
		person.setWeight(57.89);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(122);
		list.add(123);
		person.setList(list);
		ResponseEntity<Person> responseEntity =
				new ResponseEntity<Person>(person,HttpStatus.OK);
		return responseEntity;
		
	}
	@RequestMapping("service4/{age}")
	public ResponseEntity<String> service4(@PathVariable Integer age){
		ResponseEntity<String> responsEntity = null;
		if(age <= 0) {
			responsEntity = new ResponseEntity<String>("age should not be 0 or negative",HttpStatus.BAD_REQUEST);
			
		}
		else {
			responsEntity = 
					new ResponseEntity<String>("Your age is " + age,HttpStatus.OK);
		}
		return responsEntity;
		
	}
	@RequestMapping("service5/{yearOfBirth}")
	public ResponseEntity<String> service5(@PathVariable Integer yearOfBirth){
		ResponseEntity<String> responsEntity = null;
		Integer age = null;
		if(yearOfBirth > 2024) {
			responsEntity = new ResponseEntity<String>("year of Birth should not be 0 or negative",HttpStatus.BAD_REQUEST);
			
		}
		else {
			age  = 2024 - yearOfBirth;
			responsEntity = 
					new ResponseEntity<String>("Your age is " + age,HttpStatus.OK);
		}
		return responsEntity;
	
	}
	@RequestMapping("service6/{yearOfBirth}")
	public ResponseEntity<String> service6(@PathVariable Integer yearOfBirth){
		ResponseEntity<String> responsEntity = null;
		Integer age = null;
		if(yearOfBirth > 2024) {
			responsEntity = ResponseEntity.badRequest().body("year of Birth should not be 0 or negative");
			
		}
		else {
			age  = 2024 - yearOfBirth;
			responsEntity = 
					 ResponseEntity.ok().body("Your age is " + age);
		}
		return responsEntity;
	}
	
	@RequestMapping("service7")
	public ResponseEntity<String> service7() {
		return ResponseEntity.ok().body("<h1>Hello to all");
	}
	
	@RequestMapping("service8")
	public ResponseEntity<String> service8(){
		return ResponseEntity.
				         ok().
				         header("content-type","text/plain").
				         body("<h1>Hello to all</h1>");
	}
	
	@RequestMapping("service9")
	public ResponseEntity<String> service9(){
		return ResponseEntity.
				         ok().
				         header("content-type","text/html").
				         body("<h1>Hello to all</h1>");
}
	int counter = 0;
	
	@RequestMapping("service10")
	public ResponseEntity<String> service10(){
		counter ++;
		return ResponseEntity.
				         ok().
				         header("content-type","text/html").
				         header("refresh","4").
		                 body("<h1>counter value:" + counter + "</h1>");
    }
	
	@RequestMapping("service11")
	public ResponseEntity<String> service11(){
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-type","text/html");
		headers.add("refresh", "4");
		counter++;
		String responseBody = "<h1>counter value: " + counter + "</v1>";
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(responseBody,headers,HttpStatus.OK);
		
		return responseEntity;
	}
	
	@RequestMapping("service12")
	public ResponseEntity<Object> service12() throws Exception{
		File file = new File("src/main/resources/application.properties");
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-disposition" ,"attachment;filename=" +file.getName());
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
		
		ResponseEntity<Object> responseEntity =  
				ResponseEntity.ok().headers(headers).body(resource);
		
		return responseEntity;
	}
	@RequestMapping("service13")
	public ResponseEntity<Object> service13() throws Exception{
		File file = new File("src/main/resources/static/downloads/—Pngtree—watercolor sketch hand drawn for_5491678.png");
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-disposition" ,"attachment;filename=" +file.getName());
		InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
		
		ResponseEntity<Object> responseEntity =  
				ResponseEntity.ok().headers(headers).body(resource);
		return responseEntity;
	
	
	}
}
