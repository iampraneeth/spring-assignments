package com.capgemini.spring.provider;

import com.capgemini.spring.*;

public class GMMessageProvider implements MessageProvider{

	public String getMessage(){
		return "Good Morning!";
	}

}