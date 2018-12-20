package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.example.demo.model.HocPhan;

/**
 * @author chungmophantom
 *
 */
public interface  HocphanRepository extends CrudRepository<HocPhan, Integer> {
	
	/**
	 * @param q
	 * @return
	 */
	List<HocPhan> findByMaHocPhanContaining(String q);

}
