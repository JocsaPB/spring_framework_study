package com.study.springframework.module2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.springframework.module2.impl.Ball;
import com.study.springframework.module2.impl.DoSomethingElseInjection;


/*
 * Configuração e criação de Beans através de anotações
 * */
public class MainAppModule2 {

	private static final String PATH = "file:srcXml/com/study/springframework/module2/";
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context
			= new ClassPathXmlApplicationContext(PATH + "applicationContextJM-module2.xml");
		
		// Obtendo Bean declarado através de anotação @Component		
		Circle ballBean = context.getBean("soccerBall", Circle.class);
		
		System.out.println(ballBean.getClass().getSimpleName() + " - " + ballBean.whatDoForReal()+"\n");
		System.out.print("Obtendo valores por arquivos de propriedades no bean Ball : -> ");
		System.out.println(( (Ball) ballBean ).getValueDefaultTest());
		System.out.println("Finalizando instanciação de Bean através de anotação @Component e context.getBean()\n");
		
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
