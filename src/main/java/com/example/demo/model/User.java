/**
 * DHBKHN Biện Thành Chung
 */
package com.example.demo.model;

/**
 * @author LyHaoThienPC
 *
 */
public class User {
	private int id;
	private String ten;
	private String ngay_sinh;
	private String gioi_tinh;
	private String que_quan;
	private String so_dien_thoai;
	private String email;
	private String tai_khoan;
	private String mat_khau;
	private int category;
	private String ma_sinh_vien;
	
	/**
	 * @return the ma_sinh_vien
	 */
	public String getMa_sinh_vien() {
		return ma_sinh_vien;
	}
	/**
	 * @param ma_sinh_vien the ma_sinh_vien to set
	 */
	public void setMa_sinh_vien(String ma_sinh_vien) {
		this.ma_sinh_vien = ma_sinh_vien;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the ten
	 */
	public String getTen() {
		return ten;
	}
	/**
	 * @param ten the ten to set
	 */
	public void setTen(String ten) {
		this.ten = ten;
	}
	/**
	 * @return the ngay_sinh
	 */
	public String getNgay_sinh() {
		return ngay_sinh;
	}
	/**
	 * @param ngay_sinh the ngay_sinh to set
	 */
	public void setNgay_sinh(String ngay_sinh) {
		this.ngay_sinh = ngay_sinh;
	}
	/**
	 * @return the gioi_tinh
	 */
	public String getGioi_tinh() {
		return gioi_tinh;
	}
	/**
	 * @param gioi_tinh the gioi_tinh to set
	 */
	public void setGioi_tinh(String gioi_tinh) {
		this.gioi_tinh = gioi_tinh;
	}
	/**
	 * @return the que_quan
	 */
	public String getQue_quan() {
		return que_quan;
	}
	/**
	 * @param que_quan the que_quan to set
	 */
	public void setQue_quan(String que_quan) {
		this.que_quan = que_quan;
	}
	/**
	 * @return the so_dien_thoai
	 */
	public String getSo_dien_thoai() {
		return so_dien_thoai;
	}
	/**
	 * @param so_dien_thoai the so_dien_thoai to set
	 */
	public void setSo_dien_thoai(String so_dien_thoai) {
		this.so_dien_thoai = so_dien_thoai;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the tai_khoan
	 */
	public String getTai_khoan() {
		return tai_khoan;
	}
	/**
	 * @param tai_khoan the tai_khoan to set
	 */
	public void setTai_khoan(String tai_khoan) {
		this.tai_khoan = tai_khoan;
	}
	/**
	 * @return the mat_khau
	 */
	public String getMat_khau() {
		return mat_khau;
	}
	/**
	 * @param mat_khau the mat_khau to set
	 */
	public void setMat_khau(String mat_khau) {
		this.mat_khau = mat_khau;
	}
	/**
	 * @return the category
	 */
	public int getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(int category) {
		this.category = category;
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
	 * @param category
	 */
	public User(int id, String ten, String ngay_sinh, String gioi_tinh, String que_quan, String so_dien_thoai,
			String email, String tai_khoan, String mat_khau, int category) {
		super();
		this.id = id;
		this.ten = ten;
		this.ngay_sinh = ngay_sinh;
		this.gioi_tinh = gioi_tinh;
		this.que_quan = que_quan;
		this.so_dien_thoai = so_dien_thoai;
		this.email = email;
		this.tai_khoan = tai_khoan;
		this.mat_khau = mat_khau;
		this.category = category;
	}
	/**
	 * 
	 */
	public User() {
		super();
	}
	
	
}
