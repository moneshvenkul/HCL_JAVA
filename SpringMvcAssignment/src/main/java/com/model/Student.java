package com.model;

public class Student {

	private int stdID;
	private String studentName;

	public Student(int stdID, String studentName) {
		super();
		this.stdID = stdID;
		this.studentName = studentName;
	}

	public Student() {
		super();

	}

	public int getStdID() {
		return stdID;
	}

	public void setStdID(int stdID) {
		this.stdID = stdID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
