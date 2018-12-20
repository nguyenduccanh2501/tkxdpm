package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.KetQuaHocTapDao;
import com.example.demo.model.DiemSo;
import com.example.demo.model.Diemtoiec;

@Controller
public class KetQuaHocTapController {
	@Autowired
	private KetQuaHocTapDao ketQuaHocTapDao;
	
	/**
	 * Tra cứu kết quả toeic
	 * @param model
	 * @param maSVStr: mã sinh viên 
	 * @return		  : bảng điểm toeic
	 */
	
	@RequestMapping(value = "/getDiemToeic", method = RequestMethod.POST)
	public String getDiemToeic(Model model, @RequestParam("maSV")  String maSVStr) {
		List<Diemtoiec> list = null;
		int maSV = 0;
		// kiểm tra mã sinh viên nhập vào
		try {
			maSV = Integer.parseInt(maSVStr);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			model.addAttribute("msg", "Mã số sinh viên không hợp lệ");
			return "kq_toeic";
		}
		// lấy dữ liệu từ DB
		list = ketQuaHocTapDao.getDiemToiec(maSV);
		model.addAttribute("list", list);
		return "kq_toeic";
	}
	
	/**
	 * Tra cứu bảng điểm cá nhân
	 * @param model
	 * @return		  : bảng điểm cá nhân
	 */
	
	@RequestMapping(value = "/getDiemCaNhan", method = RequestMethod.POST)
	public String getDiemCaNhan(Model model, @RequestParam("maSV")  String maSVStr) {
		List<DiemSo> list = null;
		int maSV = 0;
		try {
			maSV = Integer.parseInt(maSVStr);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			model.addAttribute("msg", "Mã số sinh viên không hợp lệ");
			return "KQ_hoc_tap";
		}
		// lấy dữ liệu từ DB
		list = ketQuaHocTapDao.getDiemCaNhan(maSV);
		model.addAttribute("list", list);
		return "KQ_hoc_tap";
	}
	
	@RequestMapping(value = "/diem-toeic", method = RequestMethod.GET)
	public String diemToeic() {
		return "kq_toeic";
	}
	
	@RequestMapping(value = "/bang-diem-ca-nhan", method = RequestMethod.GET)
	public String diemHp(Model model) {
		return "KQ_hoc_tap";
	}
	
	
	
	
	//điều hướng đến trang đăng ký học phần
	@RequestMapping(value = "/dang_ky_hoc_phan", method = RequestMethod.GET)
	public String dangKyHp(Model model) {
		return "dangky_HP";
	}
	
	//điều hướng đến trang đăng ký học phần TCTD
		@RequestMapping(value = "/dang_ky_hoc_phan_TCTD", method = RequestMethod.GET)
		public String dangKyHpTCTD(Model model) {
			return "dangky_HP_TuDo";
		}
}
