package com.example.gitpractice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

	@GetMapping("/greet")
	public String greet() {
		return "Welcome to Git practice from github";
	}
	
}
