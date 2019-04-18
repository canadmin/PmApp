package com.pmapp.PmApp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pmapp.PmApp.entities.Message;

@Repository
public interface MessageRepository extends CrudRepository<Message, Long> {

}
