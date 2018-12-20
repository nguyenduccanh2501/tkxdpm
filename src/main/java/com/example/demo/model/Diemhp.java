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
@Table(name ="diem_sinh_vien_test")
public class Diemhp implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "id" , nullable = false)
	private int id;

	
	@Column(name = "ma_sinh_vien" , nullable =false)
	private String maSinhVien;
	
	@Column(name ="ma_lop" , nullable = false)
	private int maLop;
	
	@Column(name = "diem_qua_trinh" , nullable =false)
	private float diemQuaTrinh;
	
	@Column(name ="diem_ket_thuc" , nullable = false)
	private float diemKetThuc;
	
	@Column(name = "hoc_ky" , nullable =false)
	private String hocKy;
	
	public Diemhp () {
		super();
	}
	


	/**
	 * @param id
	 * @param ma_sinh_vien
	 * @param ma_lop
	 * @param diem_qua_trinh
	 * @param diem_ket_thuc
	 * @param hoc_ky
	 */
	public Diemhp(int id, String ma_sinh_vien, int ma_lop, float diem_qua_trinh, float diem_ket_thuc, String hoc_ky) {
		super();
		this.id = id;
		this.maSinhVien = ma_sinh_vien;
		this.maLop = ma_lop;
		this.diemQuaTrinh = diem_qua_trinh;
		this.diemKetThuc = diem_ket_thuc;
		this.hocKy = hoc_ky;
	}
	
	
	/**
	 * @return id
	 */
	public int getId() {
		return this.id;
	}
	/**
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
		
	/**
	 * @return ma_sinh_vien
	 */
	public String getMaSinhVien() {
		return this.maSinhVien;
	}
	/**
	 * @param ma_sinh_vien
	 */
	public void setMaSinhVien(String ma_sinh_vien) {
		this.maSinhVien = ma_sinh_vien;
	}

	/**
	 * @return ma_lop
	 */
	public int getMaLop() {
		return this.maLop;
	}
	/**
	 * @param ma_lop
	 */
	public void setMaLop(int ma_lop) {
		this.maLop = ma_lop;
	}
	
	/**
	 * @return diem_qua_trinh
	 */
	public float getDiemQuaTrinh() {
		return this.diemQuaTrinh;
	}
	/**
	 * @param diem_qua_trinh
	 */
	public void setDiemQuaTrinh(float diem_qua_trinh) {
		this.diemQuaTrinh = diem_qua_trinh;
	}
	
	/**
	 * @return diem_ket_thuc
	 */
	public float getDiemKetThuc() {
		return this.diemKetThuc;
	}
	/**
	 * @param diem_ket_thuc
	 */
	public void setDiemKetThuc(float diem_ket_thuc) {
		this.diemKetThuc = diem_ket_thuc;
	}
	
	/**
	 * @return hoc_ky
	 */
	public String getHocKy() {
		return this.hocKy;
	}
	/**
	 * @param hoc_ky
	 */
	public void setHocKy(String hocky) {
		this.hocKy = hocky;
	}
}
