package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.model.Diemhp;
import com.example.demo.model.Phanhoi;
import com.example.demo.service.PhanhoiService;


/**
 * @author chungmophantom
 *
 */
@Controller
public class GuiphanhoiController {
	
	@Autowired
	public PhanhoiService phanhoiService;
	
	
	/**
	 * Tro den trang tao 1 phan hoi ( CREATE )
	 * @param model phanhoi
	 * @return
	 */
	@GetMapping("/phanhoi/create")
	public String create(Model model) {
		
		model.addAttribute("phanhoi", new Phanhoi());
		return "phanhoi";	
	}
	
	/**
	 * Luu phan hoi vao CSDL ( SAVE )
	 * @param phanhoi phanhoi
	 * @param result
	 * @param redirect
	 * @return
	 */
	@PostMapping("/phanhoi/save")
	public String save(@Valid Phanhoi phanhoi, BindingResult result , RedirectAttributes redirect ) {
	
		if(result.hasErrors()) {
			redirect.addFlashAttribute("msg", "Da co loi, vui long nhap lai phan hoi");
			return "phanhoi";
				
		}
		
		phanhoiService.save(phanhoi);
		redirect.addFlashAttribute("msg", "Da gui phan hoi thanh cong");
		return "redirect:/phanhoi/create";		
				
	}
	
	
	//@RequestMapping(value = "/phanhoi",  method = {RequestMethod.GET, RequestMethod.POST})
	/**
	 * @param phanhoi
	 * @param bindingResult
	 * @param model
	 * @param redirect
	 * @return
	 */
	public String contactSubmit(@ModelAttribute Phanhoi phanhoi, BindingResult bindingResult, Model model ,  RedirectAttributes redirect) {
	    if (bindingResult.hasErrors()) {
	        //errors processing
	    }  
	    model.addAttribute("phanhoi", phanhoi);
	    redirect.addFlashAttribute("success", "Da gui phan hoi thanh cong");
	    return "guiphanhoi";
	}
}

