package com.hibernate.study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.study.entities.Student;
import com.hibernate.study.repository.StudentRepository;

public class Main {

	public static SessionFactory factory;
	
	public static void main(String[] args) {
		
//		testeConnection();
		
		factory = new Configuration()
		.configure("hibernate.cfg.xml")
		.addAnnotatedClass(Student.class)
		.buildSessionFactory();
		
		StudentRepository studentRepository = new StudentRepository();
		
//		Student student = new Student("Jocsã Misrraine", "Vasconcelos", "jocsadw@gmail.com");
//		studentRepository.save(student);
//		Student student2 = new Student("Jocsã Misrraine", "Vasconcelos", "jocsadw@gmail.com");
//		studentRepository.save(student2);
//		Student student3 = new Student("Jocsã Misrraine", "Vasconcelos", "jocsadw@gmail.com");
//		studentRepository.save(student3);
//		Student student4 = new Student("Jocsã Misrraine", "Vasconcelos", "jocsadw@gmail.com");
//		studentRepository.save(student4);
		
//		Student studentRetrieved = studentRepository.retrieve(2L);
		
		List<Student> retrieveAll = studentRepository.retrieveAll();
		
		for (Student student : retrieveAll) {
			
			System.out.println(student);
		}
				
		factory.close();
	}

	private static void testeConnection() {
		// Simple version how to connect hibernate with database
		String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&useTimezone=true&serverTimezone=UTC";
		String user = "hbstudent";
		String pass = "hbstudent";
			
		try {
			
			System.out.println("Connecting... " + url);
			
			Connection myConn = DriverManager.getConnection(url, user, pass);
			
			System.out.println("Connect!!!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
