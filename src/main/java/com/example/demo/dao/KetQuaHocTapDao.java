package com.example.demo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.demo.mapper.DiemSoMapper;
import com.example.demo.mapper.DiemToeicMapper;
import com.example.demo.mapper.TimeTableMapper;
import com.example.demo.model.DiemSo;
import com.example.demo.model.Diemhp;
import com.example.demo.model.Diemtoiec;
@Repository
public class KetQuaHocTapDao extends JdbcDaoSupport {
	@Autowired
	public KetQuaHocTapDao(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	public List<Diemtoiec> getDiemToiec(int maSV) {
		String sql = "SELECT diem.ma_sinh_vien, diem.diem_doc, diem.diem_nghe, "
				+"diem.ngay_thi"				
				+ " FROM diem_toiec_test diem" 
				+ " WHERE diem.ma_sinh_vien = ?";
		Object[] params = new Object[] { maSV };
		DiemToeicMapper ttmapper = new DiemToeicMapper();
		List<Diemtoiec> list = this.getJdbcTemplate().query(sql, params, ttmapper);
		return list;
	}
	
	public List<DiemSo> getDiemCaNhan(int maSV) {
		String sql  = "SELECT dklop.hoc_ky, hp.ma_hoc_phan, hp.ten_hoc_phan, hp.so_tin_chi,"
				 + " lop.ma_lop, diem.diem_qua_trinh, diem.diem_ket_thuc "
				 
				 + " FROM diem_sinh_vien_test diem " 
                 + "inner join lop_hoc_test lop on lop.ma_lop = diem.ma_lop "
                 + "inner join dang_ky_lop_test dklop on lop.ma_lop = dklop.ma_lop "
				 + "inner join hoc_phan_test hp on hp.ma_hoc_phan = lop.ma_hoc_phan " 
				 + "  WHERE diem.ma_sinh_vien = ? ";
		
		Object[] params = new Object[] {maSV};
		DiemSoMapper ttmapper = new DiemSoMapper();
		List<DiemSo> list = this.getJdbcTemplate().query(sql, params, ttmapper);
		return list;
	}

}
