package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.HocPhan;
import com.example.demo.repository.HocphanRepository;

/**
 * @author chungmophantom
 *
 */
@Service
public class HocphanServiceImplement implements HocphanService  {
	
	@Autowired
	private HocphanRepository hocphanRepository;

	@Override
	public Iterable<HocPhan> findAll() {
		// TODO Auto-generated method stub
		return hocphanRepository.findAll();
	}

	@Override
	public List<HocPhan> search(String q) {
		// TODO Auto-generated method stub
		return hocphanRepository.findByMaHocPhanContaining(q);
	}

	@Override
	public Optional<HocPhan> findOne(int id) {
		// TODO Auto-generated method stub
		return hocphanRepository.findById(id);
	}

	@Override
	public void save(HocPhan hocphan) {
		// TODO Auto-generated method stub
		hocphanRepository.save(hocphan);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		hocphanRepository.deleteById(id);
		
	}

}
