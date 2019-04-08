package com.capgemini.spring.aspect;

import org.aspectj.lang.*;
import com.capgemini.spring.calculator.impl.*;
import com.capgemini.spring.calculator.*;
import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.*;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.ProceedingJoinPoint;
@Component
@Aspect
public class ValidatingAspect{
	@Around("execution(* com.capgemini.spring.calculator.impl.Calculator.add(..))")
	public void addPrinting(ProceedingJoinPoint pjp)throws Throwable{
		Object[] args=pjp.getArgs();
		int number1=Integer.parseInt(args[0].toString());
		int number2=Integer.parseInt(args[1].toString());
		System.out.println("Aspect add is executed");
		if(number1 >0 && number2 >0)
			
			pjp.proceed();
		else	
			System.out.println("number should be greater than zero");
	}
	@Around("execution(* com.capgemini.spring.calculator.impl.Calculator.divide(..))")
	public void dividePrinting(ProceedingJoinPoint pjp)throws Throwable{	
		Object[] args=pjp.getArgs();
		double number1=Double.parseDouble(args[0].toString());
		double number2=Double.parseDouble(args[1].toString());
		
		System.out.println("Aspect divide is executed");
		if(number2!=0)
			pjp.proceed();
		else
			System.out.println("denominator should be greater than zero");
	}
}		