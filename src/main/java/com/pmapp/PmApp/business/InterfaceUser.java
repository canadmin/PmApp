package com.pmapp.PmApp.business;

import java.util.List;

import com.pmapp.PmApp.entities.User;

public interface InterfaceUser {
	void kayit(User user);
	User kullanici(Long id);
	List<User> kullanicilar();
}
