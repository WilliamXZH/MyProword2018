package com.hand.dao.impl;

import com.hand.dao.UserDao;
import com.hand.model.User;

public class EmployeeDaoImpl implements UserDao{

	public void save(User user) {
		System.out.println("Employee saved!");
	}

}
