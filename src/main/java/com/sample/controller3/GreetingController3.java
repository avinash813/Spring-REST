package com.sample.controller3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.pojo.Employee;

@RestController
@RequestMapping("/c3")
public class GreetingController3 {
	
	@GetMapping(value = "welcome")
	public Employee controller1() {
		
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("Alexa");
		emp.setCity("USA");
		return emp;
	}

}
