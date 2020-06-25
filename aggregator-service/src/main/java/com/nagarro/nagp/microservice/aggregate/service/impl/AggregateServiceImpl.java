package com.nagarro.nagp.microservice.aggregate.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nagarro.nagp.microservice.aggregate.model.AggregateDetails;
import com.nagarro.nagp.microservice.aggregate.model.OrderDetails;
import com.nagarro.nagp.microservice.aggregate.model.UserDetails;
import com.nagarro.nagp.microservice.aggregate.service.AggregateService;

/**
 * @author digvijayadhikari
 *
 */
@Service
public class AggregateServiceImpl implements AggregateService {

	@Value("${user.url}")
	private String userUrl;

	@Value("${order.url}")
	private String orderUrl;

	@Resource(name = "restTemp")
	private RestTemplate restTemplate;

	public AggregateDetails getOrderDetailsForUser(String userId) {
		AggregateDetails aggregator = new AggregateDetails();
		List<OrderDetails> orders = new ArrayList<>();
		UserDetails userDetails = null;
		try {

			ResponseEntity<UserDetails> responseUserEntity = restTemplate.getForEntity(userUrl + "/user/" + userId,
					UserDetails.class);

			userDetails = responseUserEntity.getBody();

			ResponseEntity<OrderDetails[]> responseOrderEntity = restTemplate
					.getForEntity(orderUrl + "/orders/" + userId, OrderDetails[].class);

			orders = Arrays.asList(responseOrderEntity.getBody());

		} catch (Exception ex) {
			System.out.println(ex);
		}

		aggregator.setUserDetails(userDetails);
		aggregator.setOrders(orders);
		return aggregator;
	}

}
