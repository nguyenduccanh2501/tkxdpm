package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.model.Diemtoiec;

/**
 * @author chungmophantom
 *
 */
public interface DiemtoiecService {
	/**
	 * @return
	 */
	Iterable<Diemtoiec> findAll();
	
	/**
	 * @param q
	 * @return
	 */
	List<Diemtoiec> search(String q);
	
	/**
	 * @param id
	 * @return
	 */
	Optional<Diemtoiec> findOne(int id);
	
	/**
	 * @param diem
	 */
	void save (Diemtoiec diemtoiec);
	
	/**
	 * @param id
	 */
	void delete (int id);
}
