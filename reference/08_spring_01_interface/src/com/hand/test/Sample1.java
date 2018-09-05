package com.hand.test;

import com.hand.dao.UserDao;
import com.hand.dao.impl.EmployeeDaoImpl;
import com.hand.model.User;
import com.hand.service.UserService;


/**
 * 
 */
public class Sample1
{

	@SuppressWarnings("javadoc")
	public static void main(final String[] args)
	{
		final UserService service = new UserService();

		final User usermodel = new User();
		usermodel.setUsername("will");
		usermodel.setPassword("lliw");


		//final UserDao userDao = new CustomerDaoImpl();
		final UserDao userDao = new EmployeeDaoImpl();

		service.setUserDao(userDao);
		service.add(usermodel);
	}

}
