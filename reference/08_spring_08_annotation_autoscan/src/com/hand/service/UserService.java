package com.hand.service;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.hand.dao.UserDao;
import com.hand.model.User;

@Service("userService")
@Scope("prototype")
public class UserService {
	@Resource(name="customerDao")
	private UserDao userDao;

	public void add(User user) {
		userDao.save(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
}
