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
@Table(name = "hoc_phan_test")
public class HocPhan implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "id" , nullable = false)
	private int iD;
	
	@Column(name ="ma_hoc_phan" , nullable = false)
	private String maHocPhan;
	
	@Column(name = "ten_hoc_phan" , nullable =false)
	private String tenHocPhan;
	
	@Column(name = "so_tin_chi" , nullable =false)
	private int soTinChi;
	
	@Column(name ="so_tin_hoc_phi" , nullable = false)
	private int soTinHocPhi;
	
	@Column(name = "he_so" , nullable =false)
	private float heSo;
	
	@Column(name = "id_khoa_vien" , nullable =false)
	private int idKhoaVien;
	
	public HocPhan () {
		super();
	}
	
	
	
	/**
	 * @param id
	 * @param ma_hoc_phan
	 * @param ten_hoc_phan
	 * @param so_tin_chi
	 * @param so_tin_hoc_phi
	 * @param he_so
	 * @param id_khoa_vien
	 */
	public HocPhan(int id , String ma_hoc_phan, String ten_hoc_phan, int so_tin_chi, int so_tin_hoc_phi, float he_so, int id_khoa_vien) {
		super();
		this.iD= id;
		this.maHocPhan = ma_hoc_phan;
		this.tenHocPhan = ten_hoc_phan;
		this.soTinChi = so_tin_chi;
		this.soTinHocPhi = so_tin_hoc_phi;
		this.heSo = he_so;
		this.idKhoaVien = id_khoa_vien;
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
	 * @return ma_hoc_phan
	 */
	public String getMaHocPhan() {
		return this.maHocPhan;
	}
	/**
	 * @param ma_hoc_phan
	 */
	public void setMaHocPhan(String ma_hoc_phan) {
		this.maHocPhan = ma_hoc_phan;
	}
	
	/**
	 * @return ten_hoc_phan
	 */
	public String getTenHocPhan() {
		return this.tenHocPhan;
	}
	/**
	 * @param ten_hoc_phan
	 */
	public void setTenHocPhan(String ten_hoc_phan) {
		this.tenHocPhan = ten_hoc_phan;
	}
	
	
	/**
	 * @return so_tin_chi
	 */
	public int getSoTinChi() {
		return this.soTinChi;
	}
	/**
	 * @param so_tin_chi
	 */
	public void setSoTinChi(int so_tin_chi) {
		this.soTinChi = so_tin_chi;
	}
	
	/**
	 * @return so_tin_hoc_phi
	 */
	public int getSoTinHocPhi() {
		return this.soTinHocPhi;
	}
	/**
	 * @param so_tin_hoc_phi
	 */
	public void setSoTinHocPhi(int so_tin_hoc_phi) {
		this.soTinHocPhi = so_tin_hoc_phi;
	}
	
	/**
	 * @return he_so
	 */
	public float getHeSo() {
		return this.heSo;
	}
	/**
	 * @param he_so
	 */
	public void setHeSo(float he_so) {
		this.heSo = he_so;
	}
	
	/**
	 * @return id_khoa_vien
	 */
	public int getIdKhoaVien() {
		return this.idKhoaVien;
	}
	/**
	 * @param id_khoa_vien
	 */
	public void setIdKhoaVien(int id_khoa_vien) {
		this.idKhoaVien = id_khoa_vien;
	}
}
