package com.hibernate.study.repository;

import java.util.List;

import org.hibernate.Session;

import com.hibernate.study.Main;
import com.hibernate.study.entities.Student;

public class StudentRepository {

	public Long save(Student student) {

		System.out.println("Saving the student: " + student);

		Session session = Main.factory.getCurrentSession();

		session.beginTransaction();

		Long id = (Long) session.save(student);

		session.getTransaction().commit();

		return id;
	}

	public Student retrieve(Long id) {
		System.out.println("Retrieving the student by id: " + id);

		Session currentSession = Main.factory.getCurrentSession();

		currentSession.beginTransaction();

		return currentSession.find(Student.class, id);

	}

	public List<Student> retrieveAll() {
		System.out.println("Retrieving all student");

		Session currentSession = Main.factory.getCurrentSession();

		currentSession.beginTransaction();

		return currentSession.createQuery("from Student").getResultList();
	}

}
