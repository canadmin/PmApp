package com.pmapp.PmApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.pmapp.PmApp.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
	
	
	

}
