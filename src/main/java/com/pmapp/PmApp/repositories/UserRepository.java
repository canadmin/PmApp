package com.pmapp.PmApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pmapp.PmApp.entities.User;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
