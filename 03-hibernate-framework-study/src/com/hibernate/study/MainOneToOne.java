package com.hibernate.study;

import java.util.Arrays;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.study.entities.Course;
import com.hibernate.study.entities.Instructor;
import com.hibernate.study.entities.InstructorDetail;

public class MainOneToOne {

	public static SessionFactory factory;

	public static void main(String[] args) {

		factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		InstructorDetail instructorDetal = new InstructorDetail("www.youtube.com/jocsaPB", "Study");

		Instructor instructor = new Instructor("Jocsa", "Misrraine", "jocsadw@gmail.com", instructorDetal);

		Course course1 = new Course("Curso 1", instructor);
		Course course2 = new Course("Curso 2", instructor);
		Course course3 = new Course("Curso 3", instructor);
		Course course4 = new Course("Curso 4", instructor);

		instructor.setCourses(Arrays.asList(course1, course2, course3, course4));

		factory.getCurrentSession().beginTransaction();

//		factory.getCurrentSession().save(insctructor);

		InstructorDetail find = factory.getCurrentSession().find(InstructorDetail.class, 2L);

		System.out.println(find + "\n\n" + find.getInstructor());

		factory.getCurrentSession().delete(find);

		factory.getCurrentSession().getTransaction().commit();

		factory.getCurrentSession().close();

		factory.close();
	}

	/*
	 * Source:
	 * http://docs.oracle.com/javaee/7/api/javax/persistence/JoinColumn.html#name
	 * 
	 * The table in which it is found depends upon the context.
	 * 
	 * - If the join is for a OneToOne or ManyToOne mapping using a foreign key
	 * mapping strategy, the foreign key column is in the table of the source entity
	 * or embeddable.
	 * 
	 * - If the join is for a unidirectional OneToMany mapping using a foreign key
	 * mapping strategy, the foreign key is in the table of the target entity.
	 * 
	 * - If the join is for a ManyToMany mapping or for a OneToOne or bidirectional
	 * ManyToOne/OneToMany mapping using a join table, the foreign key is in a join
	 * table.
	 * 
	 * - If the join is for an element collection, the foreign key is in a
	 * collection table.
	 * 
	 * 
	 */

}
