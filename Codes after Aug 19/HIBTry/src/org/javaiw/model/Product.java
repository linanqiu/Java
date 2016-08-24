package org.javaiw.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//@Entity
@Entity(name="Product")
@Table(name="ProductTable")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int pid;
	String pname;
	String brand;
	int price;
	//@Temporal(TemporalType.TIME)
	//Date dop;
		
//	@ElementCollection
//	Collection<Vendor> vendors = new HashSet<>();
	
	
//	@Embedded
//	@OneToOne
//	@OneToMany
	@ManyToMany
//	Vendor vendor;
//	@Embedded
//	@AttributeOverrides({@AttributeOverride(name="vname", column=@Column(name="localVname")), @AttributeOverride(name="email", column=@Column(name="localEmail"))})
//	Vendor vendor2;
	
	Collection<Vendor> vendors = new ArrayList<>();
	
//	public Vendor getVendor() {		return vendor;}
//	public void setVendor(Vendor vendor) {		this.vendor = vendor;	}
//	public Vendor getVendor2() {		return vendor2;}
//	public void setVendor2(Vendor vendor2) {	this.vendor2 = vendor2;}


//	public Date getDop() {		return dop; }
//	public void setDop(Date dop) {		this.dop = dop;	}
	
	public Collection<Vendor> getVendors() {
		return vendors;
	}
	public void setVendors(Collection<Vendor> vendors) {
		this.vendors = vendors;
	}
	//	public Collection<Vendor> getVendors() {		return vendors;	}
//	public void setVendors(Collection<Vendor> vendors) {		this.vendors = vendors;	}
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int pid, String pname, String brand, int price) {
		this.pid = pid;
		this.pname = pname;
		this.brand = brand;
		this.price = price;
	}
	
	public Product() {
	}
	

}
