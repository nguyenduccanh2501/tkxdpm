package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.DiemSo;
import com.example.demo.model.HocPhan;

public class HocPhanMapper implements RowMapper<HocPhan>{

	@Override
	public HocPhan mapRow(ResultSet rs, int rowNum) throws SQLException  {
		// TODO Auto-generated method stub
		HocPhan hp = new HocPhan();
		hp.setMaHocPhan(rs.getString("ma_hoc_phan"));
		hp.setTenHocPhan(rs.getString("ten_hoc_phan"));
		hp.setSoTinChi(rs.getInt("so_tin_chi"));
		hp.setSoTinHocPhi(rs.getInt("ma_hoc_phan"));
		hp.setHeSo(rs.getFloat("ma_hoc_phan"));
		
		return hp;
	}

}
