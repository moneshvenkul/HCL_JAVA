package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.model.Student;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AppController {

	// @RequestMapping(value="/first", method= RequestMethod.GET)
//	@RequestMapping(value="/first", method= {RequestMethod.POST, RequestMethod.GET})

	// @GetMapping(value="/first")
	@GetMapping(value = { "/first", "/second" })
	public String firstFunction() {
		// logic--> service --> dao
		System.out.println("inside first function()");
		return "Welcome"; // rendering page -- output page

	}

	@GetMapping(value = "/third")
	public String secondFunction(@RequestParam("username") String val) {
		// logic--> service --> dao
		System.out.println("inside second function()" + val);
		return "Welcome"; // rendering page -- output page

	}

	@GetMapping(value = "fourth/{alias}")
	public String thirdFunction(@PathVariable("alias") String val) // using @PathVariable
	{
		// logic--> service --> dao
		System.out.println("inside third function() using  @PathVariable" + val);
		return "Welcome"; // rendering page -- output page

	}

	// carry data from controller to JSP
	@GetMapping(value = "/carry")
	public String fourthFunction(Model model)
	// logic--> service --> dao

	{
		Student student = new Student(500, "Monesh");

		model.addAttribute("key1", student);
		return "Success"; // rendering page -- output page

	}

}
