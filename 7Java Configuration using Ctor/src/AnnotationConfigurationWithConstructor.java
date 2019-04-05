package com.capgemini.spring.annotated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.capgemini.spring.provider.*;
import com.capgemini.spring.render.*;

@Configuration
public class AnnotationConfigurationWithConstructor {
 	// equivalent to <bean id="provider" class=".."/>
 	@Bean
	 public MessageProvider provider() {
		 return new GMMessageProvider();
	 }
 	// equivalent to <bean id="renderer" class=".."/>
	 @Bean
	 public MessageRendererUsingAnnotationWithConstructor renderer(){
		 MessageRendererUsingAnnotationWithConstructor renderer = new MessageRendererUsingAnnotationWithConstructor(provider());
 		
		 return renderer;
	 }
}