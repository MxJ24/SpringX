package com.mxJ.dao;

import org.springframework.stereotype.Repository;

import com.mxJ.bean.User;
@Repository
public class UserDAOImpl implements UserDAO{
	public void addUser(User user){		
		System.out.println("���û��Ѿ����ɹ����");
	}

	public void deleteUser(User user){		
		System.out.println("���û��Ѿ����ɹ�ɾ��");
	}

	public void updateUser(User user){		
		System.out.println("���û��Ѿ����ɹ�����");
	}

	public User getUserByName(String userName){
		return null;
	}
}
