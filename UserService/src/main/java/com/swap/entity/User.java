package com.swap.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private Long userId;
	private String name;
	private String phone;
	
	private List<Contact> contactList = new ArrayList<Contact>();

	public User(Long userId, String name, String phone, List<Contact> contactList) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contactList = contactList;
	}

	public User(Long userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}


	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	
	
}
