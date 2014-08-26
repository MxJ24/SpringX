package com.mxJ.bean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class User{
	@Value("mxJ")
	private String userName;
	private int age;
	private String gender;
	private String email;     
	public User(){
		
	}
	
	@PostConstruct	
	public void postInit(){
		System.out.println("User");
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
		
	}
	
	@PreDestroy	
	public void destroy(){
		System.out.println("User");
		//commit I
	}
	
	public String toString(){
		return "I come from ChinaTown";
		//commit II
	}
}
//commit 1
//commit 2
//commit 3
