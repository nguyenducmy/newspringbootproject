package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@Autowired
	UserService service;
	@RequestMapping("/")
	public String viewHomePage(Model model)
	
	{
		List<User> listUser =service.listAll();
		
		model.addAttribute("listUser",listUser);
		return "index" ;
	}

}
