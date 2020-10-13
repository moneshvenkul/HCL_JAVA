package com.controller;

import com.model.User;

//import java.util.HashMap;
//import java.util.Map;

import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@PostMapping(value = "/login")
	public ModelAndView loginFunction(@ModelAttribute User user) // using @ModelAttribute
	{// can be done using @RequestParam
		System.out.println(user.getUserName());

		ModelAndView modelAndView = new ModelAndView("userSuccess");
		modelAndView.addObject("key2", user);
		return modelAndView;

		// using Collections it can also be done
		// Map<String, User> map= new HashMap<String, User>();
		// map.put("key", user);
		// modelAndView.addAllObjects(map);

		// model.addAttribute("key2", user);

		// return "userSuccess";
	}

}
