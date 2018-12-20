package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.context.annotation.ComponentScan;

import com.example.demo.model.HocPhan;

/**
 * @author chungmophantom
 *
 */

@ComponentScan
public interface HocphanService {
	/**
	 * @return
	 */
	Iterable<HocPhan> findAll();
	
	/**
	 * @param q
	 * @return
	 */
	List<HocPhan> search(String q);
	
	/**
	 * @param id
	 * @return
	 */
	Optional<HocPhan> findOne(int id);
	
	/**
	 * @param hocphan
	 */
	void save (HocPhan hocphan);
	
	/**
	 * @param id
	 */
	void delete (int id);
}
