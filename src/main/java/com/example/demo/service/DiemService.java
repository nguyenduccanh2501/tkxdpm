package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Diemhp;

/**
 * @author chungmophantom
 *
 */
public interface DiemService {

	/**
	 * @return
	 */
	Iterable<Diemhp> findAll();
	
	/**
	 * @param q
	 * @return
	 */
	List<Diemhp> search(String q);
	
	/**
	 * @param id
	 * @return
	 */
	Optional<Diemhp> findOne(int id);
	
	/**
	 * @param diem
	 */
	void save (Diemhp diem);
	
	/**
	 * @param id
	 */
	void delete (int id);
	
	
}
