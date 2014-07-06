package com.mxJ.bean;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/*
 * @desc Ȩ����������
 */
@Aspect
//����������Ϊһ������
@Component
//����������Ϊһ����� ������ע�����һ�����
public class PermissionIntercept{
	@Pointcut("execution(* com.mxJ.service.UserService.addUser(com.mxJ.bean.User))")//����һ������� һ����������������һ���շ�����
	public void unnamed(){//������������־��Ǹ����������� ��ǰ������������ unnamed()
		
	}
	
	 @Before("unnamed() && args(user)") //ǰ��֪ͨ ��������� unnamed(),�������صķ����Ĳ���������User��;
	 public void doAccessCheck(User user){
			System.out.println("doAccessCheck Method!!!");
	 }
	 
	 @AfterReturning(pointcut="unnamed()",returning="str")//����֪ͨ,�����õ�Ӧ�ú���֪ͨ�������ص�ֵ
	 public void after(String str){
	    	System.out.println("After Returning Method !!!");
	 }
	 
	 @After("unnamed()")//����֪ͨ
	 public void reAfter(){
	    	System.out.println("����֪ͨ");
	 }
	 
	 @AfterThrowing(pointcut="unnamed()",throwing="exc")//����֪ͨ,�������ص���Exception��Ϊ�������ݸ� exception0 ������Ϊ����
	 public void exception0(Exception exc){
	    	System.out.println("��������֪ͨ");
	 }
	 
	 @Around("unnamed()")
	 public Object methodName(ProceedingJoinPoint pjp) throws Throwable{
	    	System.out.println("Around In!!!");
	        Object result=pjp.proceed();
	        System.out.println("Around Out!!!");
	      return result;
	}
}
