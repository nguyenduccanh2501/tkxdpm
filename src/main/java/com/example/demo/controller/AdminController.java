package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author chungmophantom
 *
 */
@Controller
public class AdminController {
	/**
	 * @param model
	 * @return
	 */
	@GetMapping("/admin")
	public String index(Model model) {
	
		return "admin";
	}
}
