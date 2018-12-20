/**
 * DHBKHN Biện Thành Chung
 */
package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.DiemSo;
import com.example.demo.model.LopDangKy;

/**
 * @author LyHaoThienPC
 *
 */
public class DiemSoMapper implements RowMapper<DiemSo> {

	@Override
	public DiemSo mapRow(ResultSet rs, int rowNum) throws SQLException {
		DiemSo diemSo = new DiemSo();
		diemSo.setHocKy(rs.getString("hoc_ky"));
		diemSo.setMaHp(rs.getString("ma_hoc_phan"));
		diemSo.setTenHp(rs.getString("ten_hoc_phan"));
		diemSo.setSoTinChi(rs.getInt("so_tin_chi"));
		diemSo.setMaLop(rs.getString("ma_lop"));
		diemSo.setDiemQT(rs.getDouble("diem_qua_trinh"));
		diemSo.setDiemKT(rs.getDouble("diem_ket_thuc"));
		return diemSo;
	}
	
}
