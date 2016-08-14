package org.com.ck.service;

import java.util.List;

import org.com.ck.entity.User;

public interface IUserManager {
	public void addUser(User user);
	
	public List<User> getAllUser();
}
