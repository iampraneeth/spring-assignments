package com.capgemini.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.capgemini.spring.render.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

public class Test{
	public static void main(String a[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		MessageRender renderer = context.getBean(MessageRender.class);
		renderer.render();
	}
}
	