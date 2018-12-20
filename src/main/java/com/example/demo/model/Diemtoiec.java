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
@Table(name ="diem_toiec_test")
public class Diemtoiec implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "id" , nullable = false)
	private int id;
	
	@Column(name = "ma_sinh_vien" , nullable =false)
	private String maSinhVien;
	
	@Column(name = "diem_doc" , nullable =false)
	private int diemDoc;
	
	@Column(name ="diem_nghe" , nullable = false)
	private int diemNghe;
	
	@Column(name = "ngay_thi" , nullable =false)
	private String ngayThi;
	
	public Diemtoiec () {
		super();
	}
	

	/**
	 * @param id
	 * @param ma_sinh_vien
	 * @param diem_doc
	 * @param diem_nghe
	 * @param ngayThi
	 */
	public Diemtoiec(int id, String ma_sinh_vien, int diem_doc, int diem_nghe, String ngayThi) {
		super();
		this.id = id;
		this.maSinhVien = ma_sinh_vien;
		this.diemDoc = diem_doc;
		this.diemNghe = diem_nghe;
		this.ngayThi = ngayThi;
	}
	
	
	
	
	public Diemtoiec(String maSinhVien, int diemDoc, int diemNghe, String ngayThi) {
		super();
		this.maSinhVien = maSinhVien;
		this.diemDoc = diemDoc;
		this.diemNghe = diemNghe;
		this.ngayThi = ngayThi;
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
	 * @return diem_doc
	 */
	public int getDiemDoc() {
		return this.diemDoc;
	}
	/**
	 * @param diem_doc
	 */
	public void setDiemDoc(int diem_doc) {
		this.diemDoc = diem_doc;
	}
	
	/**
	 * @return diem_nghe
	 */
	public int getDiemNghe() {
		return this.diemNghe;
	}
	/**
	 * @param diem_qua_trinh
	 */
	public void setDiemNghe(int diem_nghe) {
		this.diemNghe = diem_nghe;
	}
	
	/**
	 * @return ngay_thi
	 */
	public String getNgayThi() {
		return this.ngayThi;
	}
	/**
	 * @param ngay_thi
	 */
	public void setNgayThi(String ngay_thi) {
		this.ngayThi = ngay_thi;
	}
}
