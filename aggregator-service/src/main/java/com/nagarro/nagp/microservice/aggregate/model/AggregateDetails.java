package com.nagarro.nagp.microservice.aggregate.model;

import java.io.Serializable;
import java.util.List;

/**
 * @author digvijayadhikari
 *
 */
public class AggregateDetails implements Serializable{

	private static final long serialVersionUID = 1L;

	private UserDetails userDetails;

	private List<OrderDetails> orders;

	public AggregateDetails() {

	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public List<OrderDetails> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderDetails> orders) {
		this.orders = orders;
	}

}
