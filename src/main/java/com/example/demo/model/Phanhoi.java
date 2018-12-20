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
@Table(name="gop_y")
public class Phanhoi implements Serializable  {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id" , nullable = false)
	private int id;
	
	@Column(name = "tieu_de" , nullable =false)
	private String tieuDe;
	
	@Column(name ="noi_dung" , nullable =false)
	private String noiDung;
	
	/**
	 * 
	 */
	public Phanhoi() {
		super();
	}
	
	/**
	 * @param id
	 * @param tieu_de
	 * @param noi_dung
	 */
	public Phanhoi(int id, String tieu_de, String noi_dung) {
		super();
		this.id = id;
		this.tieuDe = tieu_de;
		this.noiDung = noi_dung;
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
	public void setIddiemhp(int id) {
		this.id = id;
	}
	
	/**
	 * @return tieu_de
	 */
	public String getTieuDe() {
		return this.tieuDe;
	}
	/**
	 * @param tieude
	 */
	public void setTieuDe(String tieu_de) {
		this.tieuDe = tieu_de;
	}
	
	/**
	 * @return noi_dung
	 */
	public String getNoiDung() {
		return this.noiDung;
	}
	/**
	 * @param noi_dung
	 */
	public void setNoiDung(String noi_dung) {
		this.noiDung = noi_dung;
	}
}
