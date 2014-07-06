package com.mxJ.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")@Scope("prototype")
public class User{
	@Value("mxJ")//注入属性值
	private String userName;
	private int age;
	private String gender;
	private String email;
        //comments add by 
	public User(){
		
	}
	
	@PostConstruct
	//该方法相当于bean的 init-method 属性指定的方法 在类的构造方法执行完成之后执行
	public void postInit(){
		System.out.println("User 对象已经被实例化了");
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
	//该方法是在User对象的实例被销毁之前执行
	public void destroy(){
		System.out.println("User 对象被销毁了");
	}
}
