package com.example.app1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App1Application {

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}
	@RequestMapping("h1")
	public String test1() {
		System.out.println("from test1 ");
		return "this is from rest webservice";
		// http://localhost:9090/h1
	}
		@RequestMapping("h2")
		public int test2() {
			System.out.println("from test2 ");
			return 2000;
			// http://localhost:9090/h2
	}
		@RequestMapping("h3")
		public boolean test3() {
			System.out.println("from test3");
			return true;
			// http://localhost:9090/h4
		}
		@RequestMapping("h4")
		public char test4() {
			System.out.println("from test4");
			return 'a';
			// http://localhost:9090/h4
		}
		@RequestMapping("h5")
		public int[] test5(){
			int [] i = {10, 20, 30, 40, 50};
			return i;
			// http://localhost:9090/h5
		}
		@RequestMapping("h6")
		public double test6(){
			System.out.println("from test6");
			return 20.56;
			// http://localhost:9090/h5
		}
		@RequestMapping("h7")
		public float test7() {
			System.out.println("from own method");
			return 56.2f;
		}
		@RequestMapping("h8")
		public String test8() {
			System.out.println("from test8");
			return "Bhragu Dwivedi";
		}
		@RequestMapping("h9")
		public String test9() {
			System.out.println("from test9");
			return "Katyaynee Dwivedi";
		}
		@RequestMapping("h10")
		public String toString() {
			System.out.println("from test10");
			return "Raj";
		}
		@RequestMapping("h11")
		public boolean equals(Object obj) {
			
			return true;
		}
		@RequestMapping("h12")
		public String test11(String i, String j) {
			System.out.println("from h12");
			i = "Raj";
			j = "Maurya";
			return i + " " + j;
		}
		@RequestMapping("h13")
		public int hashCode() {
			System.out.println("from h13");
			return 154613265;
		}
		@RequestMapping("h22")
		public Person test22() {
			System.out.println("from test22");
			Person p1 = new Person();
			p1.setFirstName("abc");
			p1.setLstName("xyz");
			p1.setAge(22);
			return p1;
		}

		@RequestMapping("emp")
		public Employee readEmployee() {
			Employee emp = new Employee();
			emp.setFirstName("abc");
			emp.setLastName("xyz");
			emp.setAge(22);
			emp.setMoblieNos(Arrays.asList(984509845, 984509846));
			emp.setEmailIds(new String[] {"abc@abc.com", "abc@xyz.com"});
			Set<String> projects = new HashSet<String>();
			projects.add("e-commerce");
			projects.add("lms");
			projects.add("banking");
			emp.setProjects(projects);
			Map<String, String> educations = new HashMap<String, String>();
			educations.put("degree", "BE");
			educations.put("pg", "ME");
			emp.setEducations(educations);
			Address address = new Address();
			address.setHouseNo("123/M");
			address.setStreetName("BTM");
			emp.setAddress(address);
			return emp;
		}
}
    
    
//{"firstName":"abc",
//	"lastName":"xyz",
//	"age":22,
//	"emailIds":["abc@abc.com","abc@xyz.com"],   // Arrays type
//	"moblieNos":[984509845,984509846],          // list type
//	"projects":["lms","e-commerce","banking"],  // Set type
//	"educations":{"pg":"ME","degree":"BE"},
//	"address":{"houseNo":"123/M","streetName":"BTM"}} 
//