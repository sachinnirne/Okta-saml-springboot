package com.springbootsaml.sample.springbootoktasamlapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "student_info")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "stud_id")
	private Integer studentId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lasteName;
	@Column(name = "email_id")
	@Email
	private String emailId;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasteName() {
		return lasteName;
	}

	public void setLasteName(String lasteName) {
		this.lasteName = lasteName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
