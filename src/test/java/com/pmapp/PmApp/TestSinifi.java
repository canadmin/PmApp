package com.pmapp.PmApp;

import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Optional;

import javax.swing.text.StyledEditorKit.ItalicAction;

import com.pmapp.PmApp.business.InterfaceUserImpl;
import com.pmapp.PmApp.entities.User;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pmapp.PmApp.repositories.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(properties= {"spring.profiles.active.dev"})
public class TestSinifi {
	
	@Autowired
	private InterfaceUserImpl interfaceFilmService;
	
	@Before
	public void kullaniciEkle() {
		User kullanici=new User();
		kullanici.setEmail("icanyard@gmail.com");
		kullanici.setFirstName("Can");
		kullanici.setLastName("Yard");
		kullanici.setPassword("123456");
		interfaceFilmService.kayit(kullanici);
		
		
	}
	
	
	
	
	@Test
	public void kullanıcınınKendisi() {
		Optional<User> user=interfaceFilmService.kullanici(1L);
		assertNotNull(user);
		
	}

}
