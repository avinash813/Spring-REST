package com.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/c2")
public class GreetingController2 {

	@GetMapping("welcome")
	public String controller1(@RequestParam(value = "name", required=false)String name) {
		String body = "Hello "+name+" Welcome to my page";
		return body;
	}
		
		@GetMapping("welcome/{name}")
		public String controller2(@PathVariable("name")String name) {
			String body = "Helloo "+name+" Welcome to my page";
			return body;
		
		
	}
}
