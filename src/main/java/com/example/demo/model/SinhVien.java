package com.example.demo.model;


public class SinhVien {
	private int maSV;
	private String ten_sinh_vien;
	private double diem_phan_nganh;
	private int chi_tiet_phan_nganh;
	private String ky_hoc_phan_nganh;
	private String nguyen_vong_phan_nganh;
	/**
	 * @return the nguyen_vong_phan_nganh
	 */
	public String getNguyen_vong_phan_nganh() {
		return nguyen_vong_phan_nganh;
	}
	/**
	 * @param nguyen_vong_phan_nganh the nguyen_vong_phan_nganh to set
	 */
	public void setNguyen_vong_phan_nganh(String nguyen_vong_phan_nganh) {
		this.nguyen_vong_phan_nganh = nguyen_vong_phan_nganh;
	}
	/**
	 * @return the diem_phan_nganh
	 */
	public double getDiem_phan_nganh() {
		return diem_phan_nganh;
	}
	/**
	 * @param diem_phan_nganh the diem_phan_nganh to set
	 */
	public void setDiem_phan_nganh(double diem_phan_nganh) {
		this.diem_phan_nganh = diem_phan_nganh;
	}
	/**
	 * @return the chi_tiet_phan_nganh
	 */
	public int getChi_tiet_phan_nganh() {
		return chi_tiet_phan_nganh;
	}
	/**
	 * @param chi_tiet_phan_nganh the chi_tiet_phan_nganh to set
	 */
	public void setChi_tiet_phan_nganh(int chi_tiet_phan_nganh) {
		this.chi_tiet_phan_nganh = chi_tiet_phan_nganh;
	}
	/**
	 * @return the ky_hoc_phan_nganh
	 */
	public String getKy_hoc_phan_nganh() {
		return ky_hoc_phan_nganh;
	}
	/**
	 * @param ky_hoc_phan_nganh the ky_hoc_phan_nganh to set
	 */
	public void setKy_hoc_phan_nganh(String ky_hoc_phan_nganh) {
		this.ky_hoc_phan_nganh = ky_hoc_phan_nganh;
	}
	/**
	 * @return the maSV
	 */
	public int getMaSV() {
		return maSV;
	}
	/**
	 * @param maSV the maSV to set
	 */
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	/**
	 * @return the ten_sinh_vien
	 */
	public String getTen_sinh_vien() {
		return ten_sinh_vien;
	}
	/**
	 * @param ten_sinh_vien the ten_sinh_vien to set
	 */
	public void setTen_sinh_vien(String ten_sinh_vien) {
		this.ten_sinh_vien = ten_sinh_vien;
	}
	/**
	 * @param maSV
	 * @param ten_sinh_vien
	 */
	public SinhVien(int maSV, String ten_sinh_vien) {
		super();
		this.maSV = maSV;
		this.ten_sinh_vien = ten_sinh_vien;
	}
	
	/**
	 * @param maSV
	 * @param ten_sinh_vien
	 * @param diem_phan_nganh
	 * @param chi_tiet_phan_nganh
	 * @param ky_hoc_phan_nganh
	 */
	public SinhVien(int maSV, String ten_sinh_vien, double diem_phan_nganh, int chi_tiet_phan_nganh,
			String ky_hoc_phan_nganh, String nguyen_vong) {
		super();
		this.maSV = maSV;
		this.ten_sinh_vien = ten_sinh_vien;
		this.diem_phan_nganh = diem_phan_nganh;
		this.chi_tiet_phan_nganh = chi_tiet_phan_nganh;
		this.ky_hoc_phan_nganh = ky_hoc_phan_nganh;
		this.nguyen_vong_phan_nganh = nguyen_vong;
	}
	/**
	 * 
	 */
	public SinhVien() {
		super();
	}
	
	
}
