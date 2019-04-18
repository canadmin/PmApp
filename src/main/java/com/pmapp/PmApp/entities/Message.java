package com.pmapp.PmApp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
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
		this.id = id;
		this.toUser = toUser;
		this.text = text;
		this.fromUser = fromUser;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
