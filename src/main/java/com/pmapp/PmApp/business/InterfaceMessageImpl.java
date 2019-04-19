package com.pmapp.PmApp.business;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmapp.PmApp.entities.Message;
import com.pmapp.PmApp.repositories.MessageRepository;

@Service
public class InterfaceMessageImpl implements InterfaceMessage {

	@Autowired
	private MessageRepository messageRepository;

	public InterfaceMessageImpl(MessageRepository messageRepository) {
		this.messageRepository = messageRepository;
	}

	@Override
	@Transactional
	public void mesajGonder(Long kaynakId, Long hedefId, String text) {
		Message mesaj = new Message();
		mesaj.setFromUser(kaynakId);
		mesaj.setToUser(hedefId);
		mesaj.setText(text);
		
		messageRepository.save(mesaj);
	}

}
