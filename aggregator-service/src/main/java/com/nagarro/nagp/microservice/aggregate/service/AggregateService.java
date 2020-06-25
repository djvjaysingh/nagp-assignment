package com.nagarro.nagp.microservice.aggregate.service;

import com.nagarro.nagp.microservice.aggregate.model.AggregateDetails;

/**
 * @author digvijayadhikari
 *
 */
public interface AggregateService {

	public AggregateDetails getOrderDetailsForUser(String userId);
	
}
