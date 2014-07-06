package com.mxJ.dao;

import org.springframework.stereotype.Repository;

import com.mxJ.bean.User;
@Repository
public class UserDAOImpl implements UserDAO{
	public void addUser(User user){		
		System.out.println("该用户已经被成功添加");
	}

	public void deleteUser(User user){		
		System.out.println("该用户已经被成功删除");
	}

	public void updateUser(User user){		
		System.out.println("该用户已经被成功更新");
	}

	public User getUserByName(String userName){
		return null;
	}
}
