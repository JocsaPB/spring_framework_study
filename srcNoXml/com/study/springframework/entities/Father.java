package com.study.springframework.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Father implements People{

	@Autowired
	@Qualifier("son")
	private People son;
	
	@Override
	public String tellWhoIAm() {
		return "I am the father, Son's dad";
	}
	
	public People getSon() {
		return son;
	}
	
}
