package com.study.springframework.module2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.springframework.module2.impl.Ball;
import com.study.springframework.module2.impl.DoSomethingElseInjection;


/*
 * Configura��o e cria��o de Beans atrav�s de anota��es
 * */
public class MainAppModule2 {

	private static final String PATH = "file:srcXml/com/study/springframework/module2/";
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext(PATH + "applicationContextJM-module2.xml");
		
		// Obtendo Bean declarado atrav�s de anota��o @Component		
		Circle ballBean = context.getBean("soccerBall", Circle.class);
		
		System.out.println(ballBean.getClass().getSimpleName() + " - " + ballBean.whatDoForReal()+"\n");
		System.out.print("Obtendo valores por arquivos de propriedades no bean Ball : -> ");
		System.out.println(( (Ball) ballBean ).getValueDefaultTest());
		System.out.println("Finalizando instancia��o de Bean atrav�s de anota��o @Component e context.getBean()\n");
		
		// Usando @Autowired dentro da classe DoSomethingElseInjection
		DoSomethingElseInjection doSomething = context.getBean("doSomethingElseInjection", DoSomethingElseInjection.class);
		
		System.out.println(doSomething.getClass().getSimpleName() + " - " + doSomething.usingCircleToDoSomething());
		
		Circle steeringWheelBlue = context.getBean("steeringWheel", Circle.class);
		Circle steeringWheelGreen = context.getBean("steeringWheel", Circle.class);
		
		System.out.println("steeringWheelBlue is the same steeringWheelGreen? " + (steeringWheelBlue == steeringWheelGreen) );
		
		steeringWheelBlue = null;
		steeringWheelGreen = null;
		
		context.close();
	}
	
}
