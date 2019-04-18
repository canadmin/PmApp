package com.pmapp.PmApp.boostrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.pmapp.PmApp.entities.Message;
import com.pmapp.PmApp.entities.User;
import com.pmapp.PmApp.repositories.MessageRepository;
import com.pmapp.PmApp.repositories.UserRepository;

@Component
public class DevBoostrap implements ApplicationListener<ContextRefreshedEvent> {

	private UserRepository userRepository;
	private MessageRepository messageRepository;

	@Autowired
	public DevBoostrap(UserRepository userRepository, MessageRepository messageRepository) {
		this.userRepository = userRepository;
		this.messageRepository = messageRepository;

	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		initData();
		mesaj();

	}

	private void initData() {

		User user = new User();
		user.setEmail("icanyard@gmail.com");
		user.setFirstName("can");
		user.setLastName("yard");
		user.setPassword("123456");
		userRepository.save(user);

		User user2 = new User();
		user2.setEmail("yusuf@corum.koylu.leb");
		user2.setFirstName("yusuf");
		user2.setLastName("yard");
		user2.setPassword("123456");
		userRepository.save(user);
		userRepository.save(user2);

	}

	private void mesaj() {
		Message mesaj = new Message();
		mesaj.setFromUser(1L);
		mesaj.setText("Merhaba yusuf");
		mesaj.setToUser(2L);
		messageRepository.save(mesaj);

	}
}
