package com.study.springframework.module2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.springframework.module2.impl.DoSomethingElseInjection;


/*
 * Configuração e criação de Beans através de anotações
 * */
public class MainAppModule2 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext("applicationContextJM-module2.xml");
		
		// Obtendo Bean declarado através de anotação @Component		
		Circle ballBean = context.getBean("soccerBall", Circle.class);
		
		System.out.println(ballBean.whatDoForReal());
		System.out.println("Finalizando instanciação de Bean através de anotação @Component e context.getBean()\n");
		
		// Usando @Autowired dentro da classe DoSomethingElseInjection
		DoSomethingElseInjection doSomething = context.getBean("doSomethingElseInjection", DoSomethingElseInjection.class);
		
		System.out.println(doSomething.usingCircleToDoSomething());
		
		context.close();
	}
	
}
