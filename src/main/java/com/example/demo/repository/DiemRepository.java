package com.example.demo.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Diemhp;



/**
 * @author chungmophantom
 *
 */
public interface DiemRepository extends CrudRepository<Diemhp, Integer>  {

/**
 * @param q
 * @return
 */
List<Diemhp> findBymaSinhVienContaining(String q);
}
