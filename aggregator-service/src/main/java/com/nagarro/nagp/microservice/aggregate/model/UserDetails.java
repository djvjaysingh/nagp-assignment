package com.nagarro.nagp.microservice.aggregate.model;

import java.io.Serializable;

/**
 * @author digvijayadhikari
 *
 */
public class UserDetails implements Serializable{

	private static final long serialVersionUID = 1L;

	private String id;

	private String name;

	private int age;

	private String email;

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

}
