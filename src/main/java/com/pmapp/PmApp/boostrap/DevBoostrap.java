package com.pmapp.PmApp.boostrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.pmapp.PmApp.entities.User;
import com.pmapp.PmApp.repositories.UserRepository;


@Component
public class DevBoostrap implements ApplicationListener<ContextRefreshedEvent>{

	@Autowired
	private UserRepository userRepository;
	
	public DevBoostrap(UserRepository userRepository) {
		this.userRepository=userRepository;
		
	}
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		initData();
		
	}
	
	
	private void initData() {
		
		User user=new User();
		user.setEmail("icanyard@gmail.com");
		user.setFirstName("can");
		user.setLastName("yard");
		user.setPassword("123456");		
		userRepository.save(user);
		
		
		
	}
}
