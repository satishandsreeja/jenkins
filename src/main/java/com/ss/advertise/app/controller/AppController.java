package com.ss.advertise.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/app")
public class AppController {
	
	@GetMapping("/apptest")
	public String getMethodName() {
		return "test";
	}
	
	

}
