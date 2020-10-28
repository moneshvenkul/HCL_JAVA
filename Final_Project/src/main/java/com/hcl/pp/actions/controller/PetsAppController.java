package com.hcl.pp.actions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.pp.actions.entity.User;
import com.hcl.pp.actions.service.UserService;

@Controller
public class PetsAppController {

	@Autowired
	/* @Qualifier(value="userService") */
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView viewRegister(Model model) {
		return new ModelAndView("register");
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView createUser(@ModelAttribute User user) {
		userService.createEmployee(user);
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView viewLogin(@ModelAttribute User user) {
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/login1", method = RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute User user) {
		User emp = userService.getEmployee(user);
		ModelAndView model = null;
		if (emp == null) {
			model = new ModelAndView("login");
			model.addObject("result", "Invalid Username or Password");
		} else {
			model = new ModelAndView("home");
			model.addObject("emp", emp.getUsername());
		}
		return model;
	}

}