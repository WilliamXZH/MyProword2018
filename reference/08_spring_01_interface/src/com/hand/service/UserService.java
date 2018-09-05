package com.hand.service;

import com.hand.dao.UserDao;
import com.hand.model.User;


/**
 * 
 */
public class UserService
{
	private UserDao userDao;

	/**
	 * @param user
	 */
	public void add(final User user)
	{
		userDao.save(user);
	}

	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public UserDao getUserDao()
	{
		return userDao;
	}

	/**
	 * @param userDao
	 */
	public void setUserDao(final UserDao userDao)
	{
		this.userDao = userDao;
	}



}
