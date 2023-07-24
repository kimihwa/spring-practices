package com.bitacademy.container.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	private Long no = 0L;
	private String name = "둘리";
	private List<String> friends;
	
	@Autowired
	private Friend friend;
	
	public User() {
	}
	
	public User(String name) {
		this.name = name;
	}

	public User(Long no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public User(Long no, String name, List<String> friends) {
		this.no = no;
		this.name = name;
		this.friends = friends;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friends=" + friends + ", friend=" + friend + "]";
	}
}