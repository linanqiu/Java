package org.javaiw.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Embeddable
public class Vendor {
	
	String vname;
	@Id
	String email;

	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Vendor(String vname, String email) {
		this.vname = vname;
		this.email = email;
	}
	public Vendor() {
	}
}