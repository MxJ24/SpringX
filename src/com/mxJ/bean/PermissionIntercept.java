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
 * @desc 权限拦截切面
 */
@Aspect
//将该类声明为一个切面
@Component
//将该类声明为一个组件 这两个注解必须一起出现
public class PermissionIntercept{
	@Pointcut("execution(* com.mxJ.service.UserService.addUser(com.mxJ.bean.User))")//声明一个切入点 一个切入点必须依附在一个空方法上
	public void unnamed(){//这个方法的名字就是该切入点的名字 当前切入点的名字是 unnamed()
		
	}
	
	 @Before("unnamed() && args(user)") //前置通知 引用切入点 unnamed(),并且拦截的方法的参数必须是User类;
	 public void doAccessCheck(User user){
			System.out.println("doAccessCheck Method!!!");
	 }
	 
	 @AfterReturning(pointcut="unnamed()",returning="str")//后置通知,并且拿到应用后置通知方法返回的值
	 public void after(String str){
	    	System.out.println("After Returning Method !!!");
	 }
	 
	 @After("unnamed()")//最终通知
	 public void reAfter(){
	    	System.out.println("最终通知");
	 }
	 
	 @AfterThrowing(pointcut="unnamed()",throwing="exc")//例外通知,并将拦截到的Exception作为参数传递给 exception0 方法作为参数
	 public void exception0(Exception exc){
	    	System.out.println("我是例外通知");
	 }
	 
	 @Around("unnamed()")
	 public Object methodName(ProceedingJoinPoint pjp) throws Throwable{
	    	System.out.println("Around In!!!");
	        Object result=pjp.proceed();
	        System.out.println("Around Out!!!");
	      return result;
	}
}
