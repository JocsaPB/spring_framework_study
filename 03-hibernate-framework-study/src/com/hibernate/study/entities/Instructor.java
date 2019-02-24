package com.hibernate.study.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
//@Table(name="instructor") pode ser omitido pois o nome da classe refere-se exatamente ao da tabela
public class Instructor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lasName;
	
	//@Column pode ser omitido pois o nome da vari�vel refere-se exatamente a coluna da tabela
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL) // por padr�o, nenhuma estrat�gia de cascata � definida
	@JoinColumn(name = "instructor_detail_id")
	private InstructorDetail instructorDetail;

	public Instructor() {}
	
	public Instructor(String firstName, String lasName, String email, InstructorDetail instructorDetail) {
		super();
		this.firstName = firstName;
		this.lasName = lasName;
		this.email = email;
		this.instructorDetail = instructorDetail;
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

	public InstructorDetail getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(InstructorDetail instructorDetail) {
		this.instructorDetail = instructorDetail;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + "\n, firstName=" + firstName + "\n, lasName=" + lasName + "\n, email=" + email
				+ "\n, instructorDetail=" + instructorDetail + "]\n\n";
	}
}

