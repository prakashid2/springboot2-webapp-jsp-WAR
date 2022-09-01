package com.guides.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/users")
	public String home(Model model) {
		//model.addAttribute("users", userRepo.findAll());
		return "users";
	}
}
