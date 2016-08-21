package org.javaiw.restfull.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	String name;
	int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public Student() {
	}
	
}
