package com.study.springframework.module2.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.study.springframework.module2.Circle;

@Service
@Scope("singleton")
public class SteeringWheel implements Circle {

	@Override
	public String whatDoForReal() {
		return "Is used to driving a car or similar...";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("SteeringWheel Init...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("SteeringWheel PreDestroy...");
	}

}
