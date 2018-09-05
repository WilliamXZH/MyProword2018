package com.hand.model;

import java.util.Set;

import org.springframework.beans.factory.annotation.Required;


public class User
{
	private String username;
	private String password;
	private String customerType;
	private Set<String> phoneSet;

	public User()
	{

	}


	public User(final String username, final String password)
	{
		//super();
		this.username = username;
		this.password = password;
		//System.out.println("this is constuctor method!");
	}


	public String getUsername()
	{
		return username;
	}


	@Required
	public void setUsername(final String username)
	{
		this.username = username;
		//System.out.println("this is setter method!");
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(final String password)
	{
		this.password = password;
	}

	public String getCustomerType()
	{
		return customerType;
	}

	public void setCustomerType(final String customerType)
	{
		this.customerType = customerType;
	}

	public Set<String> getPhoneSet()
	{
		return phoneSet;
	}

	public void setPhoneSet(final Set<String> phoneSet)
	{
		this.phoneSet = phoneSet;
	}


}
