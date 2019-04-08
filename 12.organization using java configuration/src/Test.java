package com.capgemini.spring.organization.test;
import com.capgemini.spring.configuration.*;
import com.capgemini.spring.organization.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Test{

	public static void main(String a[]){
	
		ApplicationContext context = new AnnotationConfigApplicationContext(OrganizationConfiguration.class);
		Organization organization =context.getBean(Organization.class);
		System.out.println(organization);
	}

}