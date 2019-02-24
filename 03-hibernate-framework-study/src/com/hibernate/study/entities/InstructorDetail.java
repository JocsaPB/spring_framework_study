package com.hibernate.study.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor_detail")
public class InstructorDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "youtube_channel")
	private String youtuberChannel;
	
	private String hobby;

	public Long getId() {
		return id;
	}
	
	public InstructorDetail() {}
	
	public InstructorDetail(String youtuberChannel, String hobby) {
		super();
		this.youtuberChannel = youtuberChannel;
		this.hobby = hobby;
	}

	public String getYoutuberChannel() {
		return youtuberChannel;
	}

	public void setYoutuberChannel(String youtuberChannel) {
		this.youtuberChannel = youtuberChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "InstructorDetail [id=" + id + "\n, youtuberChannel=" + youtuberChannel + "\n, hobby=" + hobby + "]\n";
	}
	
}
