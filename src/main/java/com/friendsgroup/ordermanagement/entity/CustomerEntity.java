package com.friendsgroup.ordermanagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "customer")
public class CustomerEntity implements Serializable {

	private static final long serialVersionUID = 6491116122903725378L;

	@Id
	@GeneratedValue
	private long customerid;

	@Column(nullable = false)
	private String firstname;

	@Column(nullable = false)
	private String lastname;

	@Column(nullable = false)
	private String email;;

	@Column(nullable = false)
	private String password;

	public long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(long customerid) {
		this.customerid = customerid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
