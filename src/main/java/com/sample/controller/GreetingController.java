package com.sample.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/c1")
public class GreetingController {
	
	@GetMapping("welcome")
	public String controller1() {
		String body;
		LocalDateTime dt = LocalDateTime.now();
		int hour = dt.getHour();
		if(hour<12)
			body="Good Morning";
		else if(hour<16)
			body="Good AfterNoon";
		else if(hour<20)
			body="Good Evening";
		else
			body="Good Night";
		
		return body;
		
	}
	
	@GetMapping("welcome2")
	public ResponseEntity<String> controller2() {
		String body;
		LocalDateTime dt = LocalDateTime.now();
		int hour = dt.getHour();
		if(hour<12)
			body="Good Morning";
		else if(hour<16)
			body="Good AfterNoon";
		else if(hour<20)
			body="Good Evening";
		else
			body="Good Night";
		
		return new ResponseEntity<String>(body,HttpStatus.OK);

}
}