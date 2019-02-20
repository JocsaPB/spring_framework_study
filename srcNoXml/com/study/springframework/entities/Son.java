package com.study.springframework.entities;

import org.springframework.stereotype.Component;

@Component
public class Son implements People {

	@Override
	public String tellWhoIAm() {
		return "I am the son, child of Father class.";
	}

}
