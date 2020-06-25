package com.nagarro.nagp.microservice.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.nagp.microservice.user.dao.UserEntity;
import com.nagarro.nagp.microservice.user.model.UserDetails;
import com.nagarro.nagp.microservice.user.repository.UserRepository;
import com.nagarro.nagp.microservice.user.service.UserDetailService;

/**
 * @author digvijayadhikari
 *
 */
@Service
public class UserDetailServiceImpl implements UserDetailService {

	@Autowired
	private UserRepository repo;

	public UserDetails getUserDetail(String id) {
		UserEntity userEntity = repo.findById(id);
		UserDetails userDetails = updateModeldata(userEntity);
		return userDetails;
	}
	
	private UserDetails updateModeldata(UserEntity userEntity) {
		UserDetails userDetails = new UserDetails();
		if (userEntity != null) {
			userDetails.setId(userEntity.getId());
			userDetails.setName(userEntity.getName());
			userDetails.setAge(userEntity.getAge());
			userDetails.setEmail(userEntity.getEmail());
		} else {
			userDetails.setId("1");
			userDetails.setName("Dummy");
			userDetails.setAge(23);
			userDetails.setEmail("dummy@google.com");
		}
		return userDetails;
	}

}
