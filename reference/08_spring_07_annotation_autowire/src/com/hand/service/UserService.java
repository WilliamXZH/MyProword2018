package com.hand.service;

import javax.annotation.Resource;

import com.hand.dao.UserDao;
import com.hand.model.User;

public class UserService {
	@Resource(name="employee")
	//@Autowired @Qualifier("customer")
	private UserDao userDao;

	public void add(User user) {
		userDao.save(user);
	}

}
