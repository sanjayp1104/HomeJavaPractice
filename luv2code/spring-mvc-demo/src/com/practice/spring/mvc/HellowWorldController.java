package com.practice.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HellowWorldController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	
	@RequestMapping("/processFormTwo")
	public String modelExample(HttpServletRequest request, Model model) {
		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		String res = "Hello...  "+name;
		model.addAttribute("message", res);
		return "helloworld";
	}
	
	@RequestMapping("/processFormThree")
	public String modelExamplethree(@RequestParam("studentName") String name, Model model) {
		//String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		String res = "Hey...  "+name;
		model.addAttribute("message", res);
		return "helloworld";
	}
}
