package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.model.Diemhp;
import com.example.demo.repository.DiemRepository;


/**
 * @author chungmophantom
 *
 */
@Service
public class DiemServiceImplement implements DiemService{

	@Autowired
	private DiemRepository diemRepository;
	@Override
	public Iterable<Diemhp> findAll() {
		// TODO Auto-generated method stub
		
		return diemRepository.findAll();
	}

	@Override
	public List<Diemhp> search(String q) {
		// TODO Auto-generated method stub
		return diemRepository.findBymaSinhVienContaining(q);
	}

	@Override
	public Optional<Diemhp> findOne(int id) {
		// TODO Auto-generated method stub
		return diemRepository.findById(id);
	}

	@Override
	public void save(Diemhp diem) {
		// TODO Auto-generated method stub
		diemRepository.save(diem);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		diemRepository.deleteById(id);
	}

	

}
