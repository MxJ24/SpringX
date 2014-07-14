package com.mxJ.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")@Scope("prototype")
public class User{
	@Value("mxJ")//ע������ֵ
	private String userName;
	private int age;
	private String gender;
	private String email;
        //comments add by 
	public User(){
		
	}
	
	@PostConstruct
	//�÷����൱��bean�� init-method ����ָ���ķ��� �����Ĺ��췽��ִ������֮��ִ��
	public void postInit(){
		System.out.println("User �����Ѿ���ʵ������");
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@PreDestroy
	//�÷�������User������ʵ��������֮ǰִ��
	public void destroy(){
		System.out.println("User ������������");
	}
	
	public String toString(){
		return "I come from ChinaTown";
		//Commit by luowl
		//Second Commit;
	}
}
