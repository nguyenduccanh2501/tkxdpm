/**
 * DHBKHN Biện Thành Chung
 */
package com.example.demo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.demo.mapper.DiemSoMapper;
import com.example.demo.mapper.LopDangKyMapper;
import com.example.demo.mapper.TimeTableMapper;
import com.example.demo.model.DiemSo;
import com.example.demo.model.LopDangKy;
import com.example.demo.model.TimeTable;
import com.example.demo.utils.Common;

/**
 * @author LyHaoThienPC
 *
 */
@Repository
public class TraCuuDAO extends JdbcDaoSupport{

	@Autowired
    public TraCuuDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
	/**
	 * Lấy ra list điểm số của học kỳ phân ngnahf
	 * @param maSV
	 * @return
	 */
	public List<DiemSo> getDiem(int maSV){
		// tạo câu truy vấn
		String maSVStr = maSV + "";
		String hocKy = Common.layHocKyPhanNganh(maSVStr);
		String sql = " SELECT d.*, h.he_so, h.so_tin_chi "
				+ " FROM diem_sinh_vien d INNER JOIN lop_hoc l ON d.ma_lop = l.ma_lop "
				+ " INNER JOIN hoc_phan h on l.ma_hoc_phan = h.ma_hoc_phan "
				+ " WHERE d.ma_sinh_vien = ? "
				+ " AND d.hoc_ky = ? ";
		// tham số từ view
		Object[] params = new Object[] {maSV, hocKy};
		DiemSoMapper mapper = new DiemSoMapper();
		// truy vấn
		List<DiemSo> list = this.getJdbcTemplate().query(sql, params, mapper);
		return list;
	}
	/**
	 * Lấy ra thời khóa biểu
	 * @param maSV
	 * @return
	 */
	public List<TimeTable> getTimeTable(int maSV, String hocKy){
		// tạo câu truy vấn
		String sql = " SELECT l.*, h.ten_hoc_phan, dk.nhom "
				+ " FROM lop_hoc_test l INNER JOIN  hoc_phan_test h ON l.ma_hoc_phan = h.ma_hoc_phan "
				+ " INNER JOIN dang_ky_lop_test dk ON l.ma_lop = dk.ma_lop "
				+ " INNER JOIN sinh_vien_test sv ON dk.ma_sinh_vien = sv.ma_sinh_vien "
				+ " WHERE sv.ma_sinh_vien = ? "
				+ " AND dk.hoc_ky = ? ";
		// tham số từ view
		Object[] params = new Object[] {maSV, hocKy};
		TimeTableMapper ttmapper = new TimeTableMapper();
		// truy vấn
		List<TimeTable> list = this.getJdbcTemplate().query(sql, params, ttmapper);
		return list;
	}
	
	/**
	 * Lấy ra thời khóa biểu
	 * @param maSV
	 * @return
	 */
	public List<LopDangKy> getClassRegister(int maSV, String hocKy){
		// tạo câu truy vấn
		String sql = " SELECT sv.ma_sinh_vien, u.ten, u.ngay_sinh, dk.ma_lop, dk.nhom, "
				+ " l.ma_hoc_phan, h.ten_hoc_phan, l.loai_lop, l.lop_thi, l.tinh_trang "
				+ " FROM sinh_vien_test sv "
				+ " INNER JOIN user_test u ON sv.id_tai_khoan = u.id "
				+ " INNER JOIN dang_ky_lop_test dk ON dk.ma_sinh_vien = sv.ma_sinh_vien "
				+ " INNER JOIN lop_hoc_test l ON dk.ma_lop = l.ma_lop "
				+ " INNER JOIN hoc_phan_test h ON l.ma_hoc_phan = h.ma_hoc_phan "
				+ " WHERE sv.ma_sinh_vien = ? "
				+ " AND dk.hoc_ky = ? ";
				
		// tham số từ view
		Object[] params = new Object[] {maSV, hocKy};
		LopDangKyMapper mapper = new LopDangKyMapper();
		// truy vấn
		List<LopDangKy> list = this.getJdbcTemplate().query(sql, params, mapper);
		return list;
	}
}
