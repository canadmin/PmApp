package com.pmapp.PmApp.entities;

import javax.persistence.Entity;

@Entity
public class Message extends BaseEntity {


	private Long toUser;
	private Long fromUser;
	private String text;

	public Message() {

	}

	public Message(Long toUser, String text, Long fromUser) {
		this.toUser = toUser;
		this.text = text;
		this.fromUser = fromUser;
	}

	public Message(Long id, Long toUser, String text, Long fromUser) {
		this.setId(id);
		this.toUser = toUser;
		this.text = text;
		this.fromUser = fromUser;
	}



	public Long getToUser() {
		return toUser;
	}

	public void setToUser(Long toUser) {
		this.toUser = toUser;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getFromUser() {
		return fromUser;
	}

	public void setFromUser(Long fromUser) {
		this.fromUser = fromUser;
	}

}
