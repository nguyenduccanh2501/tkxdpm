package com.example.demo.dao;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.demo.mapper.LopDangKyMapper;
import com.example.demo.mapper.SinhVienMapper;
import com.example.demo.mapper.TimeTableMapper;
import com.example.demo.model.LopDangKy;
import com.example.demo.model.SinhVien;
import com.example.demo.model.TimeTable;

@Repository
public class MainDAO extends JdbcDaoSupport{
	
	@Autowired
    public MainDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
	/**
	 * Lấy ra thời khóa biểu
	 * @param maSV
	 * @return
	 */
	public List<TimeTable> getListLopHoc(int maSV){
		String sql = "select lh.*, hp.* " + 
				" from sinh_vien_test sv " + 
				" inner join chi_tiet_dang_ky_test ct on sv.ma_sinh_vien = ct.id_sinh_vien " + 
				" inner join lop_hoc_test lh on ct.ma_lop = lh.ma_lop " + 
				" inner join lop_hoc_mot_mon_test mm on lh.ma_lop = mm.ma_lop " + 
				" inner join hoc_phan_test hp on mm.ma_hoc_phan = hp.ma_hoc_phan" +
				" where sv.ma_sinh_vien = ?";
		Object[] params = new Object[] {maSV};
		TimeTableMapper ttmapper = new TimeTableMapper();
		List<TimeTable> list = this.getJdbcTemplate().query(sql, params, ttmapper);
		return list;
	}
	/**
	 * Lấy kết quả phân ngành
	 * @param maSV
	 * @return
	 */
	public SinhVien getDiemPhanNganh(int maSV) {
		String sql = "SELECT sv.ma_sinh_vien, sv.ten_sinh_vien, "
				+ "	sv.diem_phan_nganh, sv.chi_tiet_phan_nganh, sv.ky_hoc_phan_nganh, sv.nguyen_vong_phan_nganh "
				+ " FROM sinh_vien_test sv "
				+ " WHERE sv.ma_sinh_vien = ?;";
		
		Object[] params = new Object[] {maSV};
		SinhVienMapper svMapper = new SinhVienMapper();
		List<SinhVien> list = this.getJdbcTemplate().query(sql, params, svMapper);
		SinhVien sv = null;
		if(list.get(0) != null) {
			sv = new SinhVien();
			sv = list.get(0);
		}
		return sv;
	}
	public List<LopDangKy> getLopDangKy(int maSV, String ky_hoc){
		String sql = " select sv.ma_sinh_vien, sv.ten_sinh_vien, sv.ngay_sinh, lh.ma_lop, lh.nhom, "
				+ " hp.*, lh.loai_lop, lh.lop_thi, lh.tinh_trang "
				+ " from sinh_vien_test sv "
				+ " inner join chi_tiet_dang_ky_test ct on sv.ma_sinh_vien = ct.id_sinh_vien "
				+ " inner join lop_hoc_test lh on lh.ma_lop = ct.ma_lop "
				+ " inner join lop_hoc_mot_mon_test lhmm on lh.ma_lop = lhmm.ma_lop "
				+ " inner join hoc_phan_test hp on lhmm.ma_hoc_phan = hp.ma_hoc_phan "
				+ " where sv.ma_sinh_vien = ? "
				+ " and ct.ky_hoc = ?;";
		Object[] params = new Object[] {maSV,ky_hoc};
		LopDangKyMapper lhMapper = new LopDangKyMapper();
		List<LopDangKy> list = this.getJdbcTemplate().query(sql, params, lhMapper);
		return list;
	}
}
