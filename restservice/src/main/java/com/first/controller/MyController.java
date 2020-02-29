package com.first.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/")
	public String get(){
		System.out.println("llllllllllll");
		return "Noor......";
	}
}
