package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Userchungpt;

/**
 * @author chungmophantom
 *
 */
public interface UserRepository extends CrudRepository<Userchungpt, Integer> {
	
	
	/**
	 * @param q
	 * @return
	 */
	List<Userchungpt> findBytenContaining(String q);

}
