package com.nagarro.nagp.microservice.order.model;

import java.io.Serializable;

/**
 * @author digvijayadhikari
 *
 */
public class OrderDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	private int orderId;

	private double orderAmount;

	private String orderDate;

	private String userId;

	public OrderDetails(int orderId, double orderAmount, String orderDate, String userId) {
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
		this.userId = userId;

	}

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
