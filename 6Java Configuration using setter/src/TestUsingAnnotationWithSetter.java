package com.capgemini.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.*;
import com.capgemini.spring.render.*;
import com.capgemini.spring.annotated.*;

public class TestUsingAnnotationWithSetter{
	public static void main(String args[]){
	ApplicationContext context = new  AnnotationConfigApplicationContext(AnnotationConfiguration.class);
	MessageRenderer renderer = context.getBean("renderer",MessageRenderer.class);
	renderer.render();
	}
}