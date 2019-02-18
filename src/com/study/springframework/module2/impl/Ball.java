package com.study.springframework.module2.impl;

import org.springframework.stereotype.Component;

import com.study.springframework.module2.Circle;

@Component("soccerBall")
public class Ball implements Circle {

	@Override
	public String whatDoForReal() {
		return "Is used to play soccer";
	}

}
