package com.nagarro.nagp.microservice.user.model;

import java.io.Serializable;

/**
 * @author digvijayadhikari
 *
 */
public class UserDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

	private String name;

	private int age;

	private String email;
	
	public UserDetails() {
		
	}

	public UserDetails(String id, String name, int age, String email) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
