package com.study.springframework.module2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.springframework.module2.impl.DoSomethingElseInjection;


/*
 * Configura��o e cria��o de Beans atrav�s de anota��es
 * */
public class MainAppModule2 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext("applicationContextJM-module2.xml");
		
		// Obtendo Bean declarado atrav�s de anota��o @Component		
		Circle ballBean = context.getBean("soccerBall", Circle.class);
		
		System.out.println(ballBean.whatDoForReal());
		System.out.println("Finalizando instancia��o de Bean atrav�s de anota��o @Component e context.getBean()\n");
		
		// Usando @Autowired dentro da classe DoSomethingElseInjection
		DoSomethingElseInjection doSomething = context.getBean("doSomethingElseInjection", DoSomethingElseInjection.class);
		
		System.out.println(doSomething.usingCircleToDoSomething());
		
		context.close();
	}
	
}
