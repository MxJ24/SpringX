package com.mxJ.bean;

import java.sql.SQLException;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.mxJ.dao.CommonDAOImpl;

public class SpringTest extends TestCase{
	@Test
	public void testInitUser() throws SQLException{
		String[] configArr={"config/spring_annotation.xml","config/spring_hibernate_xml.xml"};
		AbstractXmlApplicationContext context=new FileSystemXmlApplicationContext(configArr);
		/*User user=(User)context.getBean("user");
		user.setAge(24);
		System.out.println(user.getAge());*/
		
		
		/*UserService service=(UserService)context.getBean("userService");
		service.addUser(user);*/
		CommonDAOImpl impl=(CommonDAOImpl)context.getBean("commonDAOImpl");
		for(int i=0;i<100;i++){
			impl.getDatabaseCurrentTime();
		}
		context.close();
	}
}
