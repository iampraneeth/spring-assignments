package com.capgemini.spring.aspect;

import org.aspectj.lang.*;
import com.capgemini.spring.calculator.impl.*;
import com.capgemini.spring.calculator.*;
import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.*;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;
@Component
@Aspect
public class ValidatingAspect{
	@Before("execution(* com.capgemini.spring.calculator.impl.Calculator.add(..))")
	public void addPrinting(){	
		System.out.println("Aspect add is executed");
	}
	@After("execution(* com.capgemini.spring.calculator.impl.Calculator.divide(..))")
	public void dividePrinting(){	
		System.out.println("Aspect divide is executed");
	}
}		