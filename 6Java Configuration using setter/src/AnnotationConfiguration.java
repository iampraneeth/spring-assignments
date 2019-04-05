package com.capgemini.spring.annotated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.*;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;

@Configuration
public class AnnotationConfiguration {
 	// equivalent to <bean id="provider" class=".."/>
 	@Bean
	 public MessageProvider provider() {
		 return new GMMessageProvider();
	 }
 	// equivalent to <bean id="renderer" class=".."/>
	 @Bean
	 public MessageRenderer renderer(){
		 MessageRenderer renderer = new MessageRenderer();
 		 renderer.setMessageProvider(provider());
		 return renderer;
	 }
}