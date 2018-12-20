package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author chungmophantom
 *
 */
@Entity
@Table(name ="user_test")
public class Userchungpt implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "id" , nullable = false)
	private int iD;
	
	@Column(name ="ten" , nullable = false)
	private String ten;
	
	@Column(name = "ngay_sinh" , nullable =false)
	private String ngaySinh;
	
	@Column(name = "gioi_tinh" , nullable =false)
	private String gioiTinh;
	
	@Column(name ="que_quan" , nullable = false)
	private String queQuan;
	
	@Column(name = "so_dien_thoai" , nullable =false)
	private int soDienThoai;
	
	@Column(name = "email" , nullable =false)
	private String email;
	
	@Column(name = "tai_khoan" , nullable =false)
	private String taiKhoan;
	
	@Column(name = "mat_khau" , nullable =false)
	private String matKhau;
	
	@Column(name = "id_category" , nullable =false)
	private int category;
	
	public Userchungpt () {
		super();
	}
	
	

	/**
	 * @param id
	 * @param ten
	 * @param ngay_sinh
	 * @param gioi_tinh
	 * @param que_quan
	 * @param so_dien_thoai
	 * @param email
	 * @param tai_khoan
	 * @param mat_khau
	 * @param id_category
	 */
	public Userchungpt(int id , String ten, String ngay_sinh, String gioi_tinh, String que_quan, int so_dien_thoai
			, String email, String tai_khoan, String mat_khau, int id_category) {
		super();
		this.iD= id;
		this.ten = ten;
		this.ngaySinh = ngay_sinh;
		this.gioiTinh = gioi_tinh;
		this.queQuan = que_quan;
		this.soDienThoai = so_dien_thoai;
		this.email = email;
		this.taiKhoan = tai_khoan;
		this.matKhau = mat_khau;
		this.category = id_category;
	}
	
	/**
	 * @return id
	 */
	public int getId() {
		return this.iD;
	}
	/**
	 * @param id
	 */
	public void setId(int id) {
		this.iD = id;
	}
	
	
	/**
	 * @return ten
	 */
	public String getTen() {
		return this.ten;
	}
	/**
	 * @param ten
	 */
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	/**
	 * @return ngay_sinh
	 */
	public String getNgaySinh() {
		return this.ngaySinh;
	}
	/**
	 * @param ngay_sinh
	 */
	public void setNgaySinh(String ngay_sinh) {
		this.ngaySinh = ngay_sinh;
	}
	
	
	/**
	 * @return gioi_tinh
	 */
	public String getGioiTinh() {
		return this.gioiTinh;
	}
	/**
	 * @param gioi_tinh
	 */
	public void setGioiTinh(String gioi_tinh) {
		this.gioiTinh = gioi_tinh;
	}
	
	/**
	 * @return que_quan
	 */
	public String getQueQuan() {
		return this.queQuan;
	}
	/**
	 * @param que_quan
	 */
	public void setQueQuan(String que_quan) {
		this.queQuan = que_quan;
	}
	
	/**
	 * @return so_dien_thoai
	 */
	public int getSoDienThoai() {
		return this.soDienThoai;
	}
	/**
	 * @param so_dien_thoai
	 */
	public void setSoDienThoai(int so_dien_thoai) {
		this.soDienThoai = so_dien_thoai;
	}
	
	/**
	 * @return email
	 */
	public String getEmail() {
		return this.email;
	}
	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return tai_khoan
	 */
	public String getTaiKhoan() {
		return this.taiKhoan;
	}
	/**
	 * @param tai_khoan
	 */
	public void setTaiKhoan(String tai_khoan) {
		this.taiKhoan = tai_khoan;
	}
	
	/**
	 * @return mat_khau
	 */
	public String getMatKhau() {
		return this.matKhau;
	}
	/**
	 * @param mat_khau
	 */
	public void setMatKhau(String mat_khau) {
		this.matKhau = mat_khau;
	}
	
	/**
	 * @return id_category
	 */
	public int getCategory() {
		return this.category;
	}
	/**
	 * @param id_category
	 */
	public void setCategory(int id_category) {
		this.category = id_category;
	}
	
}
