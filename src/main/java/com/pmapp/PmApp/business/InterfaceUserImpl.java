package com.pmapp.PmApp.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pmapp.PmApp.entities.User;
import com.pmapp.PmApp.repositories.UserRepository;


@Service
public class InterfaceUserImpl implements InterfaceUser {

	private UserRepository userRepository;
	
	@Autowired
	public InterfaceUserImpl(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	
	@Override
	@Transactional
	public void kayit(User user) {
		userRepository.save(user);
		
	}

	@Override
	@Transactional
	public Optional<User> kullanici(Long id) {
		Optional<User> user=userRepository.findById(id);
		
		return user;
	}

	
	@Override
	@Transactional
	public List<User> kullanicilar() {
		return null;
	}


	@Override
	@Transactional
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}


	@Override
	@Transactional
	public void guncelle(User user) {
		// TODO Auto-generated method stub
		
	}


	

}
