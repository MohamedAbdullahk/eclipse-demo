package com.docker.k8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome docker kubernate with spring boot api version : 1.8";
	}

}
