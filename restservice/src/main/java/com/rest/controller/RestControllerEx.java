package com.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerEx {

	@RequestMapping("/rest")
	public String get(){
		System.out.println("llllllllllll");
		return "Noor......";
	}
}
