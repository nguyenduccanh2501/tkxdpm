/**
 * DHBKHN Biện Thành Chung
 */
package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.TimeTable;

/**
 * @author LyHaoThienPC
 *
 */
public class TimeTableMapper implements RowMapper<TimeTable> {
	/**
	 * Map những trường trong db với những thuộc tính trong bean
	 */
	@Override
	public TimeTable mapRow(ResultSet rs, int rowNum) throws SQLException {
		// tạo biến tra về
		TimeTable timeTable = new TimeTable();
		// mapping
		timeTable.setThoiGian(rs.getString("thoi_gian_hoc"));
		timeTable.setTuanHoc(rs.getString("tuan_hoc"));
		timeTable.setPhongHoc(rs.getString("phong_hoc"));
		timeTable.setMaLop(rs.getString("ma_lop"));
		timeTable.setLoaiLop(rs.getString("loai_lop"));
		timeTable.setNhom(rs.getString("nhom"));
		timeTable.setMaHP(rs.getString("ma_hoc_phan"));
		timeTable.setTenLop(rs.getString("ten_hoc_phan"));
		timeTable.setGhiChu(rs.getString("ghi_chu"));
		return timeTable;
	}

}
