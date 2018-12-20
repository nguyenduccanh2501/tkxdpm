/**
 * DHBKHN Biện Thành Chung
 */
package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.SinhVien;

/**
 * @author LyHaoThienPC
 *
 */
public class SinhVienMapper implements RowMapper<SinhVien> {

	@Override
	public SinhVien mapRow(ResultSet rs, int rowNum) throws SQLException {
		int ma_sinh_vien = rs.getInt("ma_sinh_vien");
		String ten_sinh_vien = rs.getString("ten_sinh_vien");
		double diem_phan_nganh = rs.getDouble("diem_phan_nganh");
		int chi_tiet_phan_nganh = rs.getInt("chi_tiet_phan_nganh");
		String ky_hoc = rs.getString("ky_hoc_phan_nganh");
		String nguyen_vong = rs.getString("nguyen_vong_phan_nganh");
		
		return new SinhVien(ma_sinh_vien, ten_sinh_vien, diem_phan_nganh, chi_tiet_phan_nganh, ky_hoc, nguyen_vong);
	}
}
