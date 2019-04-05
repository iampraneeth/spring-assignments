package com.capgemini.spring.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.*;
import com.capgemini.spring.render.*;


public class TestUsingConfiguration{
	public static void main(String args[]){
	ApplicationContext context = new  ClassPathXmlApplicationContext("context.xml");
	MessageRenderer renderer = (MessageRenderer)context.getBean("renderer");
	MessageRenderer renderer1 = (MessageRenderer)context.getBean("renderer");

		System.out.println(renderer.equals(renderer1));
	
	}
}