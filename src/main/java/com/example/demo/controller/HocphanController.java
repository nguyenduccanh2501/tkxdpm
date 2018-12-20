package com.example.demo.controller;

import java.util.List;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.example.demo.model.HocPhan;
import com.example.demo.service.HocphanService;

/**
 * @author chungmophantom
 *
 */

@Controller
public class HocphanController {
	
	@Autowired
	public HocphanService hocphanService;
	
	
	/**
	 * Tro den trang quan ly hocphan
	 * @param model hocphan
	 * @return
	 */
	@GetMapping("/hocphan")
	public String index(Model model) {
		model.addAttribute("hocphans", hocphanService.findAll());
		return "indexhocphan";
	}
	/**
	 * Tro den trang tao 1 hocphan moi ( CREATE )
	 * @param model hocphan
	 * @return
	 */
	@GetMapping("/hocphan/create")
	public String create(Model model) {
		
		model.addAttribute("hocphan", new HocPhan());
		return "formhocphan";	
	}
	
	/**
	 * Tro den trang sua 1 hocphan cu ( UPDATE )
	 * @param id hocphan(id)
	 * @param model hocphan
	 * @return
	 */
	@GetMapping("/hocphan/{id}/edit")
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("hocphan", hocphanService.findOne(id));
		return "formhocphan";
	}
	
	/**
	 * Luu 1 hocphan moi vao CSDL
	 * @param hocphan (hocphan)
	 * @param result
	 * @param redirect
	 * @return
	 */
	@PostMapping("/hocphan/save")
	public String save(@Valid HocPhan hocphan, BindingResult result , RedirectAttributes redirect ) {
		if(result.hasErrors()) {
			return "formhocphan";
			
		}
		hocphanService.save(hocphan);
		redirect.addFlashAttribute("success", "Luu hoc phan thanh cong");
		return "redirect:/hocphan";		
				
	}
	/**
	 * Xoa 1 hocphan cu ( DELETE )
	 * @param id hocphan(id)
	 * @param redirect
	 * @return
	 */
	@GetMapping("/hocphan/{id}/delete")
	public String delete(@PathVariable int id, RedirectAttributes redirect) {
		hocphanService.delete(id);
		redirect.addFlashAttribute("success", "delete success");
		return "redirect:/hocphan";
	}
	
	/**
	 * Tim kiem 1 hocphan ( SEARCH )
	 * @param s String(s)
	 * @param model hocphan
	 * @return
	 */
	@GetMapping("/hocphan/search")
	public String search(@RequestParam("s") String s, Model model) {
		if(s.equals("")) {
			return "redirect:/hocphan";
		}
		
		model.addAttribute("hocphans", hocphanService.search(s));
		return "listhocphan";
	}
	
	
}
	