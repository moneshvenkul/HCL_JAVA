package com.controller;

import com.model.User;

import javax.validation.Valid;

//import java.util.HashMap;
//import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@GetMapping(value = "/login")
	public String loadPage(Model model) {
		User user = new User();
		model.addAttribute("alias", user);

		return "login"; // under WEB-INF/ pages Folder
	}

	@GetMapping(value = "*")
	public String fallBackMethod() {
		return "dummy";
	}

	@PostMapping(value = "/login")
	public ModelAndView loginFunction(@Valid @ModelAttribute("alias") User user, BindingResult result) {
		ModelAndView modelAndView;
		if (result.hasErrors()) {
			return modelAndView = new ModelAndView("login"); // login page
		}

		if (user.getPassword().equals("monesh")) {

			modelAndView = new ModelAndView("loginSuccess");
			modelAndView.addObject("userkey", user);
		} else {
			modelAndView = new ModelAndView("failure");
		}

		return modelAndView;
	}

	@GetMapping(value = "/one")
	public String one() {
		System.out.println("You were in One() + ");
		return "redirect:two";
	}

	@GetMapping(value = "/two")
	public String two() {
		System.out.println("You were in Two() + ");
		return "teabreak";
	}

	/*
	 * @PostMapping(value = "/login") public ModelAndView
	 * loginFunction(@ModelAttribute User user) // using @ModelAttribute {// can be
	 * done using @RequestParam System.out.println(user.getUserName());
	 * 
	 * ModelAndView modelAndView = new ModelAndView("userSuccess");
	 * modelAndView.addObject("key2", user); return modelAndView;
	 * 
	 * // using Collections it can also be done // Map<String, User> map= new
	 * HashMap<String, User>(); // map.put("key", user); //
	 * modelAndView.addAllObjects(map);
	 * 
	 * // model.addAttribute("key2", user);
	 * 
	 * // return "userSuccess";
	 * 
	 */
}