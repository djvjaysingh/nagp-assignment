package com.nagarro.nagp.microservice.order.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nagarro.nagp.microservice.order.model.OrderDetails;
import com.nagarro.nagp.microservice.order.services.OrderService;

/**
 * @author digvijayadhikari
 *
 */
@Service
public class OrderServiceImpl implements OrderService {

	List<OrderDetails> orderList = new ArrayList<OrderDetails>();

	public OrderServiceImpl() {
		createOrderData();
	}

	public List<OrderDetails> getOrderDetail(String userId) {
		List<OrderDetails> result = orderList.stream().filter(o -> o.getUserId().equals(userId))
				.collect(Collectors.toList());

		return result;
	}

	private void createOrderData() {
		OrderDetails order1 = new OrderDetails(1, 250, "14-Apr-2020", "1");
		OrderDetails order2 = new OrderDetails(2, 450, "15-Apr-2020", "1");
		OrderDetails order3 = new OrderDetails(3, 800, "17-May-2020", "2");
		OrderDetails order4 = new OrderDetails(4, 100, "19-May-2020", "2");
		OrderDetails order5 = new OrderDetails(5, 617, "05-Jun-2020", "3");
		OrderDetails order6 = new OrderDetails(6, 1060, "07-Jun-2020", "3");
		orderList.add(order1);
		orderList.add(order2);
		orderList.add(order3);
		orderList.add(order4);
		orderList.add(order5);
		orderList.add(order6);
	}

}
