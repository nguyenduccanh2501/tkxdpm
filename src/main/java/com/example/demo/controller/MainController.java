/**
 * DHBKHN Biện Thành Chung
 */
package com.example.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.demo.dao.KetQuaHocTapDao;
import com.example.demo.dao.LoginDAO;
import com.example.demo.dao.TraCuuDAO;
import com.example.demo.model.DiemSo;
import com.example.demo.model.Diemhp;
import com.example.demo.model.Diemtoiec;
import com.example.demo.model.LopDangKy;
import com.example.demo.model.TimeTable;
import com.example.demo.model.User;
import com.example.demo.utils.Common;


/**
 * @author Bien Thanh Chung
 *
 */
@Controller
public class MainController {
	@Autowired
    private TraCuuDAO traCuuDAO;
	
	@Autowired
    private LoginDAO loginDAO;
	
	@RequestMapping(value = "/action-change", method = RequestMethod.POST)
	public String changePass(Model model, 
			@RequestParam("old-pass")  String oldPass, 
			@RequestParam("new-pass")  String newPass,
			@RequestParam("re-new-pass")  String rePass,
			HttpServletRequest request) {
		
		
		HttpSession session = request.getSession(false);
		User user = (User) session.getAttribute("user");
		
		String oldPass_Session = user.getMat_khau();
		if(!oldPass_Session.equals(oldPass)) {
			model.addAttribute("msg", "Nhập sai mật khẩu cũ! Vui lòng nhập lại!");
			return "changePass";
		} else {
			if(!newPass.equals(rePass)) {
				model.addAttribute("msg", "Mật khẩu mới không khớp! Vui lòng nhập lại!");
				return "changePass";
			} else {
				model.addAttribute("msg", "Mời bạn đăng nhập lại!");
				loginDAO.changePass(user.getId(), newPass);
				return "login";
			}
		}
		
	}
	
	/**
	 * Check đăng nhập
	 * @param model
	 * @param username
	 * @param password
	 * @param request
	 * @return
	 */
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Model model, @RequestParam("username")  String username, 
			@RequestParam("password")  String password, HttpServletRequest request) {
		
		if(Common.isEmptyOrNull(username) || Common.isEmptyOrNull(password)) {
			model.addAttribute("msg", "Bạn cần nhập đủ tài khoản và mật khẩu");
			return "login";
			
		} else if(Common.overLength(username, 255) || Common.overLength(password, 255)){
			System.out.println(username + " 1 trong 2 vượt độ dài" + password );
			model.addAttribute("msg", "Tài khoản hoặc mật khẩu không đúng");
			return "login";
		} else {
			System.out.println("bắt đầu truy vấn");
			System.out.println(username);
			System.out.println(password);
			User user = loginDAO.getAccount(username, password);
			HttpSession session = request.getSession(true);
			if(user != null) {
				if(user.getCategory() == 1) {
					session.setAttribute("user", user);
					return "index";
				} else {
					// nếu người dùng là admin
					// return đến 1 trang của admin
					session.setAttribute("admin", user);
					return "admin";
				}
			} else {
				model.addAttribute("msg", "Tài khoản hoặc mật khẩu không đúng");
				return "login";
			}
		} 
	}
	
	
	
	
	/**
	 * Tra cứu thời khóa biểu
	 * @param model
	 * @param maSVStr : mã số sinh viên
	 * @param hocKy   : học kỳ 
	 * @return		  : thời khóa biểu
	 */
	@RequestMapping(value = "/getTimeTable", method = RequestMethod.POST)
	public String getTimeTable(Model model, @RequestParam("maSV")  String maSVStr, @RequestParam("hocKy")  String hocKy) {
		if(Common.isEmptyOrNull(maSVStr)) {
			model.addAttribute("msg", "Mã số sinh viên không hợp lệ");
			return "tracuuTKB";
		} else {
			List<TimeTable> list = null;
			int maSV = 0;
			// kiểm tra mã sinh viên nhập vào
			try {
				maSV = Integer.parseInt(maSVStr);
			} catch (NumberFormatException e) {
				e.printStackTrace();
				model.addAttribute("msg", "Mã số sinh viên không hợp lệ");
				return "tracuuTKB";
			}
			// lấy dữ liệu từ DB
			list = traCuuDAO.getTimeTable(maSV, hocKy);
			model.addAttribute("list", list);
			return "tracuuTKB";
		}
	}
	/**
	 * Tra cứu lớp những học đăng ký theo mã số sinh viên và học kỳ
	 * @param model
	 * @param maSVStr : mã số sinh viên
	 * @param hocKy   : học kỳ 
	 * @return		  : thời khóa biểu
	 */
	@RequestMapping(value = "/getClassRegister", method = RequestMethod.GET)
	public String getClassRegister(Model model, @RequestParam("maSV")  String maSVStr, @RequestParam("hocKy")  String hocKy) {
		List<LopDangKy> list = null;
		int maSV = 0;
		try {
			maSV = Integer.parseInt(maSVStr);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			model.addAttribute("msg", "Mã số sinh viên không hợp lệ");
			return "tracuuSVDKHocTap";
		}
		list = traCuuDAO.getClassRegister(maSV, hocKy);
		model.addAttribute("list", list);
		return "tracuuSVDKHocTap";
	}
	
	
	/*--- điều hướng đến trang tra cứu thời khóa biểu ---*/
	@RequestMapping(value = "/change-pass", method = RequestMethod.GET)
	public String changePass() {
		return "changePass";
	}
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public String profile() {
		return "profile";
	}
	/*--- điều hướng---*/ 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homepage() {
		return "login";
	}
	
	
	
	/*--- điều hướng đến trang tra cứu thời khóa biểu ---*/
	@RequestMapping(value = "/thoi-khoa-bieu", method = RequestMethod.GET)
	public String thoiKhoaBieu() {
		return "tracuuTKB";
	}
	/*--- điều hướng đến trang tra cứu đăng ký học tập ---*/
	@RequestMapping(value = "/dang-ky-hoc-tap", method = RequestMethod.GET)
	public String dangKyHocTap() {
		return "tracuuSVDKHocTap";
	}
	/*--- điều hướng đến trang tra cứu kết quả phân khoa viện ---*/
	@RequestMapping(value = "/ket-qua-phan-khoa", method = RequestMethod.GET)
	public String ketQuaPhanKhoa(Model model) {
		return "tracuuKQPK";
	}
	
	
}
