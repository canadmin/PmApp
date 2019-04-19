package com.pmapp.PmApp.business;

import java.util.List;
import java.util.Optional;

import com.pmapp.PmApp.entities.User;

public interface InterfaceUser {
	void kayit(User user);

	Optional<User> kullanici(Long id);

	List<User> kullanicilar();

	void delete(User user);

	void guncelle(User user);
	

}
