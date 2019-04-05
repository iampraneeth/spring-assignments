package com.capgemini.spring.render;

import com.capgemini.spring.provider.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class MessageRender{
	
	private MessageProvider messageProvider;
	
	public void render(){
		System.out.println(messageProvider.getMessage());
	}
	@Autowired
	@Qualifier("hm")
	public void setMessageProvider(MessageProvider messageProvider){
		this.messageProvider=messageProvider; 
	}
	

		
}