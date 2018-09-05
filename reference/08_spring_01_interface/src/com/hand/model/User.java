package com.hand.model;


/**
 * 
 */
public class User
{
	private String username;
	private String password;

	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public String getUsername()
	{
		return username;
	}

	/**
	 * @param username
	 */
	public void setUsername(final String username)
	{
		this.username = username;
	}


	/**
	 * @return
	 */
	@SuppressWarnings("javadoc")
	public String getPassword()
	{
		return password;
	}

	/**
	 * @param password
	 */
	public void setPassword(final String password)
	{
		this.password = password;
	}
}
