package com.study.springframework.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.springframework.module1.Coach;

// Alguns exercícios de criação de beans com diferentes escopos e realizando chamadas no init-method e destroy-method;
public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext("lifecycle-applicationContextJM.xml");
		
		Coach singletonCoachA = context.getBean("mySingletonCoach", Coach.class);
		Coach singletonCoachB = context.getBean("mySingletonCoach", Coach.class);
		
		System.out.println("signletonCoachA is equal signletonCoachB: " + ( singletonCoachA == singletonCoachB ));
		System.out.println();
		
		Coach prototypeCoachA = context.getBean("myPrototypeCoach", Coach.class);
		Coach prototypeCoachB = context.getBean("myPrototypeCoach", Coach.class);
		
		System.out.println("prototypeCoachA is equal prototypeCoachB: " + ( prototypeCoachA == prototypeCoachB ));
		
		context.close();
		
	}
	
}

