/**
 * DHBKHN Biện Thành Chung
 */
package com.example.demo.model;

/**
 * @author LyHaoThienPC
 *
 */
public class LopHoc {
	private int maLop;
	private String thoiGian;
	private String tuanHoc;
	private String phongHoc;
	private String loaiLop;
	private String nhom;
	private String tenLop;
	private String ghiChu;
	private String lopThi;
	private String tinhTrang;
	/**
	 * @return the lopThi
	 */
	public String getLopThi() {
		return lopThi;
	}
	/**
	 * @param maLop
	 * @param thoiGian
	 * @param tuanHoc
	 * @param phongHoc
	 * @param loaiLop
	 * @param nhom
	 * @param tenLop
	 * @param ghiChu
	 * @param lopThi
	 * @param tinhTrang
	 */
	public LopHoc(int maLop, String thoiGian, String tuanHoc, String phongHoc, String loaiLop, String nhom,
			String tenLop, String ghiChu, String lopThi, String tinhTrang) {
		super();
		this.maLop = maLop;
		this.thoiGian = thoiGian;
		this.tuanHoc = tuanHoc;
		this.phongHoc = phongHoc;
		this.loaiLop = loaiLop;
		this.nhom = nhom;
		this.tenLop = tenLop;
		this.ghiChu = ghiChu;
		this.lopThi = lopThi;
		this.tinhTrang = tinhTrang;
	}
	/**
	 * @param lopThi the lopThi to set
	 */
	public void setLopThi(String lopThi) {
		this.lopThi = lopThi;
	}
	/**
	 * @return the tinhTrang
	 */
	public String getTinhTrang() {
		return tinhTrang;
	}
	/**
	 * @param tinhTrang the tinhTrang to set
	 */
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	/**
	 * @return the maLop
	 */
	public int getMaLop() {
		return maLop;
	}
	/**
	 * @param maLop the maLop to set
	 */
	public void setMaLop(int maLop) {
		this.maLop = maLop;
	}
	/**
	 * @return the thoiGian
	 */
	public String getThoiGian() {
		return thoiGian;
	}
	/**
	 * @param thoiGian the thoiGian to set
	 */
	public void setThoiGian(String thoiGian) {
		this.thoiGian = thoiGian;
	}
	/**
	 * @return the tuanHoc
	 */
	public String getTuanHoc() {
		return tuanHoc;
	}
	/**
	 * @param tuanHoc the tuanHoc to set
	 */
	public void setTuanHoc(String tuanHoc) {
		this.tuanHoc = tuanHoc;
	}
	/**
	 * @return the phongHoc
	 */
	public String getPhongHoc() {
		return phongHoc;
	}
	/**
	 * @param phongHoc the phongHoc to set
	 */
	public void setPhongHoc(String phongHoc) {
		this.phongHoc = phongHoc;
	}
	/**
	 * @return the loaiLop
	 */
	public String getLoaiLop() {
		return loaiLop;
	}
	/**
	 * @param loaiLop the loaiLop to set
	 */
	public void setLoaiLop(String loaiLop) {
		this.loaiLop = loaiLop;
	}
	/**
	 * @return the nhom
	 */
	public String getNhom() {
		return nhom;
	}
	/**
	 * @param nhom the nhom to set
	 */
	public void setNhom(String nhom) {
		this.nhom = nhom;
	}
	/**
	 * @return the tenLop
	 */
	public String getTenLop() {
		return tenLop;
	}
	/**
	 * @param tenLop the tenLop to set
	 */
	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}
	/**
	 * @return the ghiChu
	 */
	public String getGhiChu() {
		return ghiChu;
	}
	/**
	 * @param ghiChu the ghiChu to set
	 */
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	/**
	 * @param maLop
	 * @param thoiGian
	 * @param tuanHoc
	 * @param phongHoc
	 * @param loaiLop
	 * @param nhom
	 * @param tenLop
	 * @param ghiChu
	 */
	public LopHoc(int maLop, String thoiGian, String tuanHoc, String phongHoc, String loaiLop, String nhom,
			String tenLop, String ghiChu) {
		super();
		this.maLop = maLop;
		this.thoiGian = thoiGian;
		this.tuanHoc = tuanHoc;
		this.phongHoc = phongHoc;
		this.loaiLop = loaiLop;
		this.nhom = nhom;
		this.tenLop = tenLop;
		this.ghiChu = ghiChu;
	}
	/**
	 * 
	 */
	public LopHoc() {
		super();
	}
	
	
}
