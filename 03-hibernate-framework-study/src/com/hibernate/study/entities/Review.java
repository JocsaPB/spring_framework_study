package com.hibernate.study.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// possui relacionamento unidirecional com Course
@Entity
@Table(name="review")
public class Review {

	@Id
	private Long id;
	
	@Column(name="review_description")
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getId() {
		return id;
	}
	
}
