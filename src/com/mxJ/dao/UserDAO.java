package com.mxJ.dao;

import com.mxJ.bean.User;

/*
 * @desc 接口不必声明为一个Bean
 */
public interface UserDAO{
	public void addUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);
	public User getUserByName(String userName);
}
