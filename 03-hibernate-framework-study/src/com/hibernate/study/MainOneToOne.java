package com.hibernate.study;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.study.entities.Instructor;
import com.hibernate.study.entities.InstructorDetail;

public class MainOneToOne {

	public static SessionFactory factory;
	
	public static void main(String[] args) {
		
		factory = new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Instructor.class)
			.addAnnotatedClass(InstructorDetail.class)
			.buildSessionFactory();

//		InstructorDetail instructorDetal = new InstructorDetail("www.youtube.com/jocsaPB", "Study");
		
//		Instructor insctructor = new Instructor("Jocsa", "Misrraine","jocsadw@gmail.com", instructorDetal);
				
		factory.getCurrentSession().beginTransaction();
		
//		factory.getCurrentSession().save(insctructor);
		
		InstructorDetail find = factory.getCurrentSession().find(InstructorDetail.class, 2L);
		
		System.out.println(find + "\n\n" + find.getInstructor());
		
		factory.getCurrentSession().delete(find);
		
		factory.getCurrentSession().getTransaction().commit();
		
		factory.getCurrentSession().close();
		
		factory.close();
	}

}
