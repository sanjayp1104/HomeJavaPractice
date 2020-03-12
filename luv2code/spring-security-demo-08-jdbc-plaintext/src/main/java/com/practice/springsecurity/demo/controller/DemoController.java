package com.practice.springsecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/leaders")
	public String handleLeaders() {
		return "leaders";
	}
	
	@GetMapping("/systems")
	public String handleSystems() {
		return "systems";
	}
}
