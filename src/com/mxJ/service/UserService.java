package com.mxJ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mxJ.bean.User;
import com.mxJ.dao.UserDAO;

@Service
public class UserService{
	@Autowired
	@Qualifier("userDAOImpl")
	private UserDAO userdao;
	
	public void addUser(User user){
		userdao.addUser(user);
	}
	
	public void deleteUser(User user){
		userdao.deleteUser(user);
	}
	
	public void updateUser(User user){
		userdao.updateUser(user);
	}
	
	public User getUserByName(String userName){
		return userdao.getUserByName(userName);
	}
}
