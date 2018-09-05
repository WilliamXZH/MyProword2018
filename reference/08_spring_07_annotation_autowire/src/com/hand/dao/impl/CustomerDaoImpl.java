package com.hand.dao.impl;

import com.hand.dao.UserDao;
import com.hand.model.User;

public class CustomerDaoImpl implements UserDao {

	public void save(User user) {
		validate(user);
		System.out.println("Customer saved!");
	}

	public void validate(User user) {
		if (user.getCustomerType() == null) {
			return;
		}

		if (user.getCustomerType().equals("Dealer")) {
			System.out.println("validate Dealer");
		} else {
			System.out.println("validate Distributor");
		}
	}

}
