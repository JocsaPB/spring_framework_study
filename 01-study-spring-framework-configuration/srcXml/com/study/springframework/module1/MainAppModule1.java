package com.study.springframework.module1;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Abordando:
 * 		Inversão e Controle
 * 		Injeção de dependência
 * */
public class MainAppModule1 {

	private static final String PATH = "file:srcXml/com/study/springframework/module1/";
	
	public static void main(String[] args) {

		// lendo arquivo de configuração
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext(PATH + "applicationContextJM-module1.xml");

		// obtendo bean através do spring container
		Coach coach = context.getBean("myCoach", Coach.class);

		if (coach.getIsInVacation()) {
			System.out.println("Is not possible offer any exercises. Coach in vacation!");
		} else {
			System.out.println(coach.getDailyWorkout());
		}

		List<String> fullDailyWorkouts = coach.getFullDailyWorkouts();

		System.out.println("Print full coach exercises: ");
		for (String string : fullDailyWorkouts) {
			System.out.println("   " + string);
		}

		context.close();
	}

}
