package com.mxJ.dao;

import com.mxJ.bean.User;

/*
 * @desc �ӿڲ�������Ϊһ��Bean
 */
public interface UserDAO{
	public void addUser(User user);
	public void deleteUser(User user);
	public void updateUser(User user);
	public User getUserByName(String userName);
}
