package com.study.springframework.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DeveloperInformation {

	@Value("${developer.name}")
	public String name;
	
	@Value("${developer.email}")
	public String email;
	
	
}
