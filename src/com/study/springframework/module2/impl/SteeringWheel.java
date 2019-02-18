package com.study.springframework.module2.impl;

import org.springframework.stereotype.Service;

import com.study.springframework.module2.Circle;

@Service
public class SteeringWheel implements Circle {

	@Override
	public String whatDoForReal() {
		return "Is used to driving a car or similar...";
	}

}
