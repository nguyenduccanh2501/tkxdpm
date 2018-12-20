package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.model.Diemhp;
import com.example.demo.service.DiemService;

/**
 * @author chungmophantom
 *
 */
@Controller
public class DiemController {
	
	@Autowired
	public DiemService diemService;
	
	/**
	 * Tro den trang quan ly diem
	 * @param model diemhp
	 * @return
	 */
	@GetMapping("/diem")
	public String index(Model model) {
		model.addAttribute("diems", diemService.findAll());
		return "indexdiemhp";
	}
	/**
	 * Tro den trang tao 1 Diem moi ( CREATE )
	 * @param model diemhp
	 * @return
	 */
	@GetMapping("/diem/create")
	public String create(Model model) {
		
		model.addAttribute("diem", new Diemhp());
		return "form";	
	}
	
	/**
	 * Tro den trang sua 1 diem cu ( UPDATE )
	 * @param id diemhp(id)
	 * @param model diemhp
	 * @return
	 */
	@GetMapping("/diem/{id}/edit")
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("diem", diemService.findOne(id));
		return "form";
	}
	
	/**
	 * Luu 1 diem moi vao CSDL
	 * @param diem (diemhp)
	 * @param result
	 * @param redirect
	 * @return
	 */
	@PostMapping("/diem/save")
	public String save(@Valid Diemhp diem, BindingResult result , RedirectAttributes redirect ) {
		if(result.hasErrors()) {
			return "form";
			
		}
		diemService.save(diem);
		redirect.addFlashAttribute("success", "saved diem successfully");
		return "redirect:/diem";		
				
	}
	/**
	 * Xoa 1 diem cu ( DELETE )
	 * @param id diemhp(id)
	 * @param redirect
	 * @return
	 */
	@GetMapping("/diem/{id}/delete")
	public String delete(@PathVariable int id, RedirectAttributes redirect) {
		diemService.delete(id);
		redirect.addFlashAttribute("success", "delete success");
		return "redirect:/diem";
	}
	
	/**
	 * Tim kiem 1 diem ( SEARCH )
	 * @param s String(s)
	 * @param model diemhp
	 * @return
	 */
	@GetMapping("/diem/search")
	public String search(@RequestParam("s") String s, Model model) {
		if(s.equals("")) {
			return "redirect:/diem";
		}
		
		model.addAttribute("diems", diemService.search(s));
		return "indexdiemhp";
	}
	}
	
	

