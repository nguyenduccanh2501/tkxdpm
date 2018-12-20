/**
 * DHBKHN Biện Thành Chung
 */
package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.TimeTable;
import com.example.demo.model.User;

/**
 * @author LyHaoThienPC
 *
 */
public class UserMapper implements RowMapper<User>{
	/**
	 * Mapper
	 */
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// bắt đầu mapping
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setTen(rs.getString("ten"));
		user.setNgay_sinh(rs.getString("ngay_sinh"));
		user.setGioi_tinh(rs.getString("gioi_tinh"));
		user.setQue_quan(rs.getString("que_quan"));
		user.setSo_dien_thoai(rs.getString("so_dien_thoai"));
		user.setEmail(rs.getString("email"));
		user.setTai_khoan(rs.getString("tai_khoan"));
		user.setMat_khau(rs.getString("mat_khau"));
		user.setCategory(rs.getInt("id_category"));
		user.setMa_sinh_vien(rs.getString("ma_sinh_vien"));
		return user;
	}
	
}
