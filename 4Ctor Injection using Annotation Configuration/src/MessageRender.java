package com.capgemini.spring.render;

import com.capgemini.spring.provider.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class MessageRender{
	
	private MessageProvider messageProvider;
	@Autowired
	public MessageRender(MessageProvider messageProvider){
		this.messageProvider=messageProvider; 
	
	}
	public void render(){
		System.out.println(messageProvider.getMessage());
	}
	/*public void setMessageProvider(MessageProvider messageProvider){
		this.messageProvider=messageProvider; 
	}*/
	

		
}