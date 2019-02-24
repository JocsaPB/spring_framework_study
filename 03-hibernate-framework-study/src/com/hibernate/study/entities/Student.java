package com.hibernate.study.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lasName;
	
	private String email;
	
	public Student() {}
	
	public Student(Long id, String firstName, String lasName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lasName = lasName;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasName() {
		return lasName;
	}

	public void setLasName(String lasName) {
		this.lasName = lasName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lasName=" + lasName + ", email=" + email + "]";
	}
	
}
