package com.capgemini.spring.render;

import com.capgemini.spring.provider.*;

public class MessageRenderer{

	private MessageProvider messageProvider;

	public void render(){
		System.out.println(messageProvider.getMessage());
	}
	
	public void setMessageProvider(MessageProvider messageProvider){
		this.messageProvider = messageProvider;
	}	

}