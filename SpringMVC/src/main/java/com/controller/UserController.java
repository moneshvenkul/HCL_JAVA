/**
 * 
 */
package com.controller;

/**
 * @author mvven
 *
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping(value = "/first")
	public String lunchBreak() {
// logic --service -- Dao
		return "success";
	}

}
