package com.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerExaple {

	@RequestMapping("/hello")
	@ResponseBody
	public String get(){
		System.out.println("llllllllllll");
		return "Noor......";
	}
}
