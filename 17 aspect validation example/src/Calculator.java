package com.capgemini.spring.calculator.impl;

import com.capgemini.spring.calculator.*;
import org.springframework.stereotype.Component;
@Component
public class Calculator implements CalculatorInterface{
	
	public void add(int num1,int num2){
		System.out.println(num1+num2);
	}
	public void divide(double num1,double num2){
		System.out.println(num1/num2);
	}
}