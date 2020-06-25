package com.nagarro.nagp.microservice.order.services;

import java.util.List;

import com.nagarro.nagp.microservice.order.model.OrderDetails;

/**
 * @author digvijayadhikari
 *
 */
public interface OrderService {

	public List<OrderDetails> getOrderDetail(String userId);
	
}
