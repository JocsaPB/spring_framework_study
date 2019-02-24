package com.study.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.study.springframework.entities.Mother;
import com.study.springframework.entities.People;

@Configuration
@ComponentScan("com.study.springframework")
@PropertySource("classpath:properties.properties")
public class ProjectConfig {

	@Bean
	public People mother() {
		return new Mother();
	}
	
}
