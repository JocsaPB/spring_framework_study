package com.study.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springframework.entities.DeveloperInformation;
import com.study.springframework.entities.Father;
import com.study.springframework.entities.People;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context
			= new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		People bean = context.getBean("father", People.class);
		
		System.out.println(bean.tellWhoIAm());
		
		System.out.println("\nAnd... " + ((Father) bean).getSon().tellWhoIAm() );
		
		System.out.println("\nAnd finally... " + context.getBean("mother", People.class).tellWhoIAm() + "\n");
				
		DeveloperInformation devInformation = context.getBean("developerInformation", DeveloperInformation.class);
		System.out.println("Developer by: " + devInformation.name);
		System.out.println("Developer - email: " + devInformation.email);
	}
	
}
