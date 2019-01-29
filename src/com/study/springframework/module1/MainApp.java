package com.study.springframework.module1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Abordando:
 * 		Invers�o e Controle
 * 		Inje��o de depend�ncia
 * */
public class MainApp {

	public static void main(String[] args) {

		// lendo arquivo de configura��o
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextJM.xml");
		
		// obtendo bean atrav�s do spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();
	}

}
