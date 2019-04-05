package com.capgemini.spring.provider;

import com.capgemini.spring.*;
import org.springframework.context.annotation.*;
import org.springframework.context.*;

public class HWMessageProvider implements MessageProvider{

	public String getMessage(){
		return "Hello World...";
	}

}