package com.hand.dao.impl;

import com.hand.dao.UserDao;
import com.hand.model.User;


/**
 * 
 */
public class CustomerDaoImpl implements UserDao
{
	public void save(final User user)
	{
		//connetion database 
		//insert into user ....
		//commit
		System.out.println("validate sercurity ");
		System.out.println("Customer saved!");
	}
}
