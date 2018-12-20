/**
 * DHBKHN Biện Thành Chung
 */
package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.LopDangKy;
import com.example.demo.model.TimeTable;

/**
 * @author LyHaoThienPC
 *
 */
public class LopDangKyMapper implements RowMapper<LopDangKy> {
	/* mapp với cơ sở dữ liệu */
	@Override
	public LopDangKy mapRow(ResultSet rs, int rowNum) throws SQLException {
		/*
		 * Băt đầu mapping
		 */
		LopDangKy lopDangKy = new LopDangKy();
		lopDangKy.setMa_sinh_vien(rs.getString("ma_sinh_vien"));
		lopDangKy.setTen_sinh_vien(rs.getString("ten"));
		lopDangKy.setNgay_sinh(rs.getDate("ngay_sinh").toString());
		lopDangKy.setMa_lop(rs.getString("ma_lop"));
		lopDangKy.setNhom(rs.getString("nhom"));
		lopDangKy.setMa_hoc_phan(rs.getString("ma_hoc_phan"));
		lopDangKy.setTen_hoc_phan(rs.getString("ten_hoc_phan"));
		lopDangKy.setLoai_lop(rs.getString("loai_lop"));
		lopDangKy.setLop_thi(rs.getString("lop_thi"));
		lopDangKy.setTinh_trang(rs.getString("tinh_trang"));
		return lopDangKy;
	}

}
