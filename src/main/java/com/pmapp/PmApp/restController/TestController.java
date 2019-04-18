package com.pmapp.PmApp.restController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmapp.PmApp.entities.User;
import com.pmapp.PmApp.repositories.UserRepository;

@RestController
@RequestMapping("/api/v2")
public class TestController {

	private UserRepository userRepository;
	
	public TestController(UserRepository userRepository) {
		this.userRepository=userRepository;
	}
	
	
	@GetMapping("/kullanicilar")
	public List<User> kullanicilar() {
		return (List<User>) userRepository.findAll();
	}
	
	
	
	
}
