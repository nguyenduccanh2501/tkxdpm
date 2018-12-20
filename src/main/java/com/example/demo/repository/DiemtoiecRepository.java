package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.model.Diemtoiec;

/**
 * @author chungmophantom
 *
 */
public interface DiemtoiecRepository extends CrudRepository<Diemtoiec, Integer> {
	/**
	 * @param q
	 * @return
	 */
	List<Diemtoiec> findBymaSinhVienContaining(String q);
}
