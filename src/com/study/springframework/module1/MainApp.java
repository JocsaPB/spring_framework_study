package com.study.springframework.module1;

import java.util.List;

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
		
		if(coach.getIsInVacation()) {
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
