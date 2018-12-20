package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Phanhoi;
import com.example.demo.repository.Phanhoirepository;
/**
 * @author chungmophantom
 *
 */
@Service
public class PhanhoiServiceImplement implements PhanhoiService {

	@Autowired
	Phanhoirepository phanhoiRepository;
	@Override
	public void save(Phanhoi phanhoi) {
		// TODO Auto-generated method stub
		phanhoiRepository.save(phanhoi);
	}

}
