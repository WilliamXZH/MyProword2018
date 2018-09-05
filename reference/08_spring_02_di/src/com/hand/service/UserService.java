package com.hand.service;

import com.hand.dao.UserDao;
import com.hand.model.User;


public class UserService
{
	private UserDao userDao;

	public void add(final User user)
	{
		userDao.save(user);
		//new CustomerDaoImpl().save(user);
		//new EmployeeDaoImpl().save(user);
	}

	public UserDao getUserDao()
	{
		return userDao;
	}

	public void setUserDao(final UserDao userDao)
	{
		this.userDao = userDao;
	}



}
