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
import com.example.demo.model.Diemtoiec;
import com.example.demo.service.DiemService;
import com.example.demo.service.DiemtoiecService;

/**
 * @author chungmophantom
 *
 */
@Controller
public class DiemtoiecController {
	
	@Autowired
	public DiemtoiecService diemtoiecService;
	
	/**
	 * Tro den trang quan ly diemtoiec
	 * @param model diemtoiec
	 * @return
	 */
	@GetMapping("/diemtoiec")
	public String index(Model model) {
		model.addAttribute("diemtoiecs", diemtoiecService.findAll());
		return "indexdiemtoiec";
	}
	/**
	 * Tro den trang tao 1 Diemtoiec moi ( CREATE )
	 * @param model diemtoiec
	 * @return
	 */
	@GetMapping("/diemtoiec/create")
	public String create(Model model) {
		
		model.addAttribute("diemtoiec", new Diemtoiec());
		return "formdiemtoiec";	
	}
	
	/**
	 * Tro den trang sua 1 diemtoiec cu ( UPDATE )
	 * @param id diemtoiec(id)
	 * @param model diemtoiec
	 * @return
	 */
	@GetMapping("/diemtoiec/{id}/edit")
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("diemtoiec", diemtoiecService.findOne(id));
		return "formdiemtoiec";
	}
	
	/**
	 * Luu 1 diemtoiec moi vao CSDL
	 * @param diemtoiec (diemtoiec)
	 * @param result
	 * @param redirect
	 * @return
	 */
	@PostMapping("/diemtoiec/save")
	public String save(@Valid Diemtoiec diemtoiec, BindingResult result , RedirectAttributes redirect ) {
		if(result.hasErrors()) {
			return "formdiemtoiec";
			
		}
		diemtoiecService.save(diemtoiec);
		redirect.addFlashAttribute("success", "saved diem successfully");
		return "redirect:/diemtoiec";		
				
	}
	/**
	 * Xoa 1 diemtoiec cu ( DELETE )
	 * @param id diemtoiec(id)
	 * @param redirect
	 * @return
	 */
	@GetMapping("/diemtoiec/{id}/delete")
	public String delete(@PathVariable int id, RedirectAttributes redirect) {
		diemtoiecService.delete(id);
		redirect.addFlashAttribute("success", "delete success");
		return "redirect:/diemtoiec";
	}
	
	/**
	 * Tim kiem 1 diemtoiec ( SEARCH )
	 * @param s String(s)
	 * @param model diemtoiec
	 * @return
	 */
	@GetMapping("/diemtoiec/search")
	public String search(@RequestParam("s") String s, Model model) {
		if(s.equals("")) {
			return "redirect:/diemtoiec";
		}
		
		model.addAttribute("diemtoiecs", diemtoiecService.search(s));
		return "indexdiemtoiec";
	}
}
