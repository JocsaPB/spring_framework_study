package com.study.springframework.module2.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.study.springframework.module2.Circle;

@Component
public class DoSomethingElseInjection {

	// Autowired diretamente no field
	@Autowired
	// Usa-se o Qualifier quando existe mais de uma implementa��o para a mesma interface
	@Qualifier("steeringWheel")
	private Circle circle;
	
	/*
	Autowired atrav�s de constructor 
	@Autowired
	DoSomethingElseInjection(Circle theCircle) {
		circle = theCircle;
	}
	*/

	/*
	 * Autowired atrav�s de method
	@Autowired
	@Qualifier("steeringWheel")
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	*/
	
	public String usingCircleToDoSomething(){
		return circle.whatDoForReal();
	}
}
