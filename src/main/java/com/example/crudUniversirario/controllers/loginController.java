package com.example.crudUniversirario.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

	
	@GetMapping({"/","/index"})
	public String index() {
		
		return "index";
	}

	
	@GetMapping("/menu")
	public String menu() {
		
		return "menu";
	}
	
	
	@GetMapping("/admin")
	public String admin() {
		
		return "menu";
	}
	
	
	@GetMapping("/user")
	public String user() {
		
		return "user";
	}
}
