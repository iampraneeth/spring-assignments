package com.capgemini.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.*;
import com.capgemini.spring.render.*;
import com.capgemini.spring.annotated.*;

public class TestUsingAnnotationWithConstructor{
	public static void main(String args[]){
	ApplicationContext context = new  AnnotationConfigApplicationContext(AnnotationConfigurationWithConstructor.class);
	MessageRendererUsingAnnotationWithConstructor renderer = context.getBean("renderer",MessageRendererUsingAnnotationWithConstructor.class);
	renderer.render();
	}
}