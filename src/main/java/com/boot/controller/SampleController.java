package com.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	
	@GetMapping(value="/getWishes")
	public String getWishes() {
		return "Good Morning";
	}

	@GetMapping(value="/getSum")
	@ResponseBody
	public int getSum(@RequestParam("a") int a,@RequestParam("b") int b) {
		int c = a + b;
		return c;
		
	}
	
	@PostMapping(value="/hello")
	public String getDetails(@RequestParam("user")String username) {
		return username;
	}
	

}
