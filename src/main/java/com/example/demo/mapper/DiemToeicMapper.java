package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.example.demo.model.Diemtoiec;
import org.springframework.jdbc.core.RowMapper;

public class DiemToeicMapper implements RowMapper<Diemtoiec> {
	@Override
	public Diemtoiec mapRow(ResultSet rs, int rowNum) throws SQLException {
		Diemtoiec diemtoiec = new Diemtoiec();
		diemtoiec.setMaSinhVien(rs.getString("ma_sinh_vien"));		
		diemtoiec.setDiemDoc(rs.getInt("diem_doc"));
		diemtoiec.setDiemNghe(rs.getInt("diem_nghe"));
		diemtoiec.setNgayThi(rs.getString("ngay_thi"));
		return diemtoiec;
	}
}
