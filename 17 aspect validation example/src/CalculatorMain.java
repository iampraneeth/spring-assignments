package com.capgemini.spring.calculator.main;

import com.capgemini.spring.calculator.impl.*;
import com.capgemini.spring.calculator.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class CalculatorMain{

	public static void main(String a[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		CalculatorInterface cal=context.getBean(CalculatorInterface.class);
		cal.add(10,13);
		cal.divide(3.0,0.0);
	}
	
}
