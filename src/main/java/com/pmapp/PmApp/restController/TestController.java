package com.pmapp.PmApp.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmapp.PmApp.business.InterfaceUserImpl;
import com.pmapp.PmApp.entities.Message;
import com.pmapp.PmApp.entities.User;
import com.pmapp.PmApp.repositories.MessageRepository;
import com.pmapp.PmApp.repositories.UserRepository;

@RestController
@RequestMapping("/api/v2")
public class TestController {

	private InterfaceUserImpl interfaceFilmService;
	private MessageRepository messageRepository;

	@Autowired
	public TestController(InterfaceUserImpl interfaceFilmSevice, MessageRepository messageRepository) {
		this.interfaceFilmService = interfaceFilmSevice;
		this.messageRepository = messageRepository;

	}

	@GetMapping("/kullanicilar")
	public List<User> kullanicilar() {
		return (List<User>) interfaceFilmService.kullanicilar();
	}

	@PostMapping("/ekle")
	public void kullaniciEkle(@RequestBody User user) {
		interfaceFilmService.kayit(user);
	}

	@PostMapping("/sil")
	public void sil(@RequestBody User user) {
		interfaceFilmService.delete(user);

	}

	@PostMapping("/update")
	public void guncelle(@RequestBody User user) {
		interfaceFilmService.guncelle(user);

	}

}
