package org.javaiw.model;

import java.util.Date;

public class Employee {
	int empno;
	String ename;
	String job;
	int sal;
	Date doj;
	
	public Employee(){
		super();
	}
	
	public Employee(int empno, String ename, String job, int sal, Date doj) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.doj = doj;
	}
	
	@Override
	public String toString(){
		return ename + " works as " + job + " and gets Rs. " + sal;
	}
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	
}
