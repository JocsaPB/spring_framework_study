package com.study.springframework.module2.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.study.springframework.module2.Circle;

@Component("soccerBall")
public class Ball implements Circle {

	@Value("${valueDefaultTest}")
	private String valueDefaultTest;
	
	@Override
	public String whatDoForReal() {
		return "Is used to play soccer";
	}

	public String getValueDefaultTest() {
		return valueDefaultTest;
	}

	public void setValueDefaultTest(String valueDefaultTest) {
		this.valueDefaultTest = valueDefaultTest;
	}

}
