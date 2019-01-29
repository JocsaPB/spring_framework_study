package com.study.springframework.module1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Abordando:
 * 		Inversão e Controle
 * 		Injeção de dependência
 * */
public class MainApp {

	public static void main(String[] args) {

		// lendo arquivo de configuração
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextJM.xml");
		
		// obtendo bean através do spring container
		Coach coach = context.getBean("myCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();
	}

}
