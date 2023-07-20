package com.springboot.firstproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping("/getProject")
	public String getFunc() {
		return "first GET example";
	}
	
	
	
}
