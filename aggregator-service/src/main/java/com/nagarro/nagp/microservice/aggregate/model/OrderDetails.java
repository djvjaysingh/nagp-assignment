package com.nagarro.nagp.microservice.aggregate.model;

import java.io.Serializable;

/**
 * @author digvijayadhikari
 *
 */
public class OrderDetails implements Serializable{

	private static final long serialVersionUID = 1L;

	private int orderId;

	private double orderAmount;

	private String orderDate;

	private String userId;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getOrderId() {
		return orderId;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public String getOrderDate() {
		return orderDate;
	}

}
