package com.java.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Student {
	@Id
	@Column
	//@GeneratedValue(strategy=GenerationType.AUTO) //for autonumber
	private int studentId;
	@Column
	private String firstname;
	@Column
	private String lastname;
	@Column
	private int yearLevel;
	@Column
	private String deparment;
	@Column
	private String college;

	public Student(){}
	public Student(int studentId, String firstname, String lastname,
			int yearLevel,String deparment, String college) {
		super();
		this.studentId = studentId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.yearLevel = yearLevel;
		this.deparment = deparment;
		this.college = college;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getYearLevel() {
		return yearLevel;
	}
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	public String getDeparment() {
		return deparment;
	}
	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}

}
