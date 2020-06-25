package com.nagarro.nagp.microservice.aggregate.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.microservice.aggregate.model.AggregateDetails;
import com.nagarro.nagp.microservice.aggregate.service.AggregateService;

/**
 * @author digvijayadhikari
 *
 */
@RestController
@RequestMapping("/orderdetails")
public class AggregateController {

	@Resource
	private AggregateService aggregateService;

	@GetMapping(value = "/{userId}")
	public AggregateDetails getOderDetailsForUser(@PathVariable(name = "userId") String userId) {

		return aggregateService.getOrderDetailsForUser(userId);
	}

}
