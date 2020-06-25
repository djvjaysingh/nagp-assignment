package com.nagarro.nagp.microservice.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.microservice.order.model.OrderDetails;
import com.nagarro.nagp.microservice.order.services.OrderService;

/**
 * @author digvijayadhikari
 *
 */
@RestController
@RequestMapping("/orders")
public class OrderServiceController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/{userId}")
	public @ResponseBody List<OrderDetails> getOrderDetail(@PathVariable("userId") String userId)
	{
		return orderService.getOrderDetail(userId);
	}
	
}
