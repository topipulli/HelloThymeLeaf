package com.example.HelloThymeLeaf.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@GetMapping("hello")
	public String welcome(@RequestParam (name="name") String name, 
			@RequestParam (name="age") String age,
			Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello";
		
	}
}