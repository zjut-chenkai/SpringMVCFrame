package org.com.ck.service;

import java.util.List;

import org.com.ck.dao.UserDAO;
import org.com.ck.entity.User;

public class UserManager implements IUserManager {
	private UserDAO userDao;
	public UserDAO getUserDao() {
		return userDao;
	}
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.add(user);
		
	}
/*	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userDao.getAllUser();
	}*/
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
