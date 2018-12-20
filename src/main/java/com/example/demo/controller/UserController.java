package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.example.demo.model.Userchungpt;
import com.example.demo.service.UserService;


/**
 * @author chungmophantom
 *
 */
@Controller
public class UserController {
	
	@Autowired
	public UserService userService;
	
	/**
	 * Tro den trang quan ly user
	 * @param model user
	 * @return
	 */
	@GetMapping("/user")
	public String index(Model model) {
		model.addAttribute("users", userService.findAll());
		return "indexuser";
	}
	/**
	 * Tro den trang tao 1 User moi ( CREATE )
	 * @param model User
	 * @return
	 */
	@GetMapping("/user/create")
	public String create(Model model) {
		
		model.addAttribute("user", new Userchungpt());
		return "formuser";	
	}
	
	/**
	 * Tro den trang sua 1 User cu ( UPDATE )
	 * @param id User(id)
	 * @param model User
	 * @return
	 */
	@GetMapping("/user/{id}/edit")
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("user", userService.findOne(id));
		return "formuser";
	}
	
	/**
	 * Luu 1 User moi vao CSDL
	 * @param Userchungpt (user)
	 * @param result
	 * @param redirect
	 * @return
	 */
	@PostMapping("/user/save")
	public String save(@Valid Userchungpt user, BindingResult result , RedirectAttributes redirect ) {
		if(result.hasErrors()) {
			return "formuser";
			
		}
		userService.save(user);
		redirect.addFlashAttribute("success", "saved User successfully");
		return "redirect:/user";		
				
	}
	/**
	 * Xoa 1 user cu ( DELETE )
	 * @param id User(id)
	 * @param redirect
	 * @return
	 */
	@GetMapping("/user/{id}/delete")
	public String delete(@PathVariable int id, RedirectAttributes redirect) {
		userService.delete(id);
		redirect.addFlashAttribute("success", "delete success");
		return "redirect:/user";
	}
	
	/**
	 * Tim kiem 1 User ( SEARCH )
	 * @param s String(s)
	 * @param model User
	 * @return
	 */
	@GetMapping("/user/search")
	public String search(@RequestParam("s") String s, Model model) {
		if(s.equals("")) {
			return "redirect:/user";
		}
		
		model.addAttribute("users", userService.search(s));
		return "indexuser";
	}
	
}
