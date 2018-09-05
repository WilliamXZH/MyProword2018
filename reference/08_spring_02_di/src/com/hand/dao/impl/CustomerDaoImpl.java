package com.hand.dao.impl;

import com.hand.dao.UserDao;
import com.hand.model.User;


public class CustomerDaoImpl implements UserDao
{

	public void save(final User user)
	{
		validate(user);
		System.out.println("Customer saved!");
	}

	public void validate(final User user)
	{
		//System.out.println(user.getCustomerType().equals("Dealer"));
		if (user.getCustomerType().equals("Dealer"))
		{
			System.out.println("validate Dealer");
		}
		else
		{
			System.out.println("validate Distributor");
		}
	}


}
