package com.nagarro.nagp.microservice.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.nagp.microservice.user.model.UserDetails;
import com.nagarro.nagp.microservice.user.service.UserDetailService;

/**
 * @author digvijayadhikari
 *
 */
@RestController
@RequestMapping("/user")
public class UserDetailController {
	
	@Autowired
	private UserDetailService userDetailService;
	
	@GetMapping("/{userId}")
	public @ResponseBody UserDetails getUserDetail(@PathVariable("userId") String id) {
		return userDetailService.getUserDetail(id);
	}
	
}
