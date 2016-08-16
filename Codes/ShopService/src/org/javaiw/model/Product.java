package org.javaiw.model;

import javax.xml.bind.annotation.XmlRootElement;

//This is a bean. Bean means normal java class

@XmlRootElement //Our class gets described as part of our wsdl because we wrote @XmlRootElement here
public class Product {
	
	int pid; //Product id
	String pname; //Product name
	int price; 
	String brand;
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public Product(int pid, String pname, int price, String brand) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.brand = brand;
	}
	
	public Product(){}

}