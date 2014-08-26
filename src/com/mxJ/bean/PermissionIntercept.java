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

@Aspect
@Component
public class PermissionIntercept{
	@Pointcut("execution(* com.mxJ.service.UserService.addUser(com.mxJ.bean.User))")
	public void unnamed(){

	}

	 @Before("unnamed() && args(user)")
	 public void doAccessCheck(User user){
			System.out.println("doAccessCheck Method!!!");
	 }

	 @AfterReturning(pointcut="unnamed()",returning="str")
	 public void after(String str){
	    	System.out.println("After Returning Method !!!");
	 }

	 @After("unnamed()")
	 public void reAfter(){
	    	System.out.println("");
	 }

	 @AfterThrowing(pointcut="unnamed()",throwing="exc")
	 public void exception0(Exception exc){
	    	System.out.println("");
	 }

	 @Around("unnamed()")
	 public Object methodName(ProceedingJoinPoint pjp) throws Throwable{
	    	System.out.println("Around In!!!");
	        Object result=pjp.proceed();
	        //add a amend commit
	      return result;
	}
}
