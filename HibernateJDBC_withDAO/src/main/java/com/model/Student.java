package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Student implements Serializable {
	@Id
	private int studId;
	private String sname;

	@ManyToOne
	private Teacher teacher;

	public Student() {
		super();

	}

	/*
	 * public Student(int studId, String sname) { super(); this.studId = studId;
	 * this.sname = sname; }
	 */
	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

}
