package com.capgemini.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.*;
import com.capgemini.spring.render.*;
import com.capgemini.spring.annotated.*;

public class TestUsingConfiguration{
	public static void main(String args[]){
	ApplicationContext context = new  AnnotationConfigApplicationContext(AnnotationConfiguration.class);
	MessageRenderer renderer = context.getBean("renderer",MessageRenderer.class);
	MessageRenderer renderer1 = context.getBean("renderer",MessageRenderer.class);

	if(renderer == renderer1 ){
		System.out.println("Singleton");
		System.out.println(renderer.hashCode());
		System.out.println(renderer1.hashCode());
	}else{
		System.out.println("Not Singleton");
	}
	}
}