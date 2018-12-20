/**
 * DHBKHN Biện Thành Chung
 */
package com.example.demo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.demo.mapper.TimeTableMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.TimeTable;
import com.example.demo.model.User;

/**
 * @author LyHaoThienPC
 *
 */
@Repository
public class LoginDAO extends JdbcDaoSupport {
	@Autowired
    public LoginDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
	
	/**
	 * Lấy ra thời khóa biểu
	 * @param maSV
	 * @return
	 */
	public User getAccount(String username, String password){
		// tạo câu truy vấn
		String sql = "SELECT sv.ma_sinh_vien, u.*  "
				+ " FROM user_test u LEFT JOIN sinh_vien_test sv ON sv.id_tai_khoan = u.id "
				+ " WHERE u.tai_khoan = ? "
				+ " AND u.mat_khau = ?";
		// tham số từ view
		Object[] params = new Object[] {username, password};
		UserMapper mapper = new UserMapper();
		// truy vấn
		List<User> list =  this.getJdbcTemplate().query(sql, params, mapper);
		System.out.println(list.size());
		// kiểm tra có tồn tại tài khoản
		if(list.size() != 0) {
			return list.get(0);
		} else {
			return null;
		}
	}
	/**
	 * Thay đổi mật khẩu
	 * @param mssv
	 * @param newPass
	 */
	public void changePass(int mssv, String newPass) {
		String sqlUpdate = "UPDATE user_test SET mat_khau = ? where id = ?";
		this.getJdbcTemplate().update(sqlUpdate, newPass, mssv);
	}
}
