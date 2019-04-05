package com.capgemini.spring.render;

import com.capgemini.spring.provider.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageRendererUsingAnnotationWithConstructor{

	private MessageProvider messageProvider;

	public MessageRendererUsingAnnotationWithConstructor(){}
	@Autowired
	public MessageRendererUsingAnnotationWithConstructor(MessageProvider message){
		this.messageProvider = message;
	}

	public void render(){
		System.out.println(messageProvider.getMessage());
	}
	
		

}