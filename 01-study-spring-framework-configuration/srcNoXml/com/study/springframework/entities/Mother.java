package com.study.springframework.entities;

// but doesn't use @Component, because is configured in ProjectConfig class
public class Mother implements People {

	@Override
	public String tellWhoIAm() {
		return "I am the Mother, Father's boss.";
	}

}
