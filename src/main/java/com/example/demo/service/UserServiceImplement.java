package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Userchungpt;
import com.example.demo.repository.UserRepository;

/**
 * @author chungmophantom
 *
 */
@Service
public class UserServiceImplement implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public Iterable<Userchungpt> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public List<Userchungpt> search(String q) {
		// TODO Auto-generated method stub
		return userRepository.findBytenContaining(q);
	}

	@Override
	public Optional<Userchungpt> findOne(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

	@Override
	public void save(Userchungpt user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}


}
