package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Diemtoiec;
import com.example.demo.repository.DiemtoiecRepository;

/**
 * @author chungmophantom
 *
 */
@Service
public class DiemtoiecImplement implements DiemtoiecService{

	@Autowired
	private DiemtoiecRepository diemtoiecRepository;
	
	@Override
	public Iterable<Diemtoiec> findAll() {
		// TODO Auto-generated method stub
		return diemtoiecRepository.findAll();
	}

	@Override
	public List<Diemtoiec> search(String q) {
		// TODO Auto-generated method stub
		return diemtoiecRepository.findBymaSinhVienContaining(q);
	}

	@Override
	public Optional<Diemtoiec> findOne(int id) {
		// TODO Auto-generated method stub
		return diemtoiecRepository.findById(id);
	}

	@Override
	public void save(Diemtoiec diemtoiec) {
		// TODO Auto-generated method stub
		diemtoiecRepository.save(diemtoiec);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		diemtoiecRepository.deleteById(id);
	}

}
