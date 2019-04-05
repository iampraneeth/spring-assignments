package com.capgemini.spring.render;

import com.capgemini.spring.provider.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;

@Component
public class MessageRender{
	@Autowired
	private MessageProvider messageProvider;
	
	public void render(){
		System.out.println(messageProvider.getMessage());
	}
	
	

		
}