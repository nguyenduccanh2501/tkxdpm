package com.example.demo.service;

import java.util.List;
import java.util.Optional;


import com.example.demo.model.Userchungpt;


/**
 * @author chungmophantom
 *
 */
public interface UserService {

	/**
	 * @return
	 */
	Iterable<Userchungpt> findAll();
	
	/**
	 * @param q
	 * @return
	 */
	List<Userchungpt> search(String q);
	
	/**
	 * @param id
	 * @return
	 */
	Optional<Userchungpt> findOne(int id);
	
	/**
	 * @param diem
	 */
	void save (Userchungpt user);
	
	/**
	 * @param id
	 */
	void delete (int id);

}
