package com.exprest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.exprest.models.User;


@RestController
@RequestMapping("/recebe")
public class Controle {
	
	@Autowired
	private User user;
	
	@CrossOrigin
	@RequestMapping(value ="/usuario", method = RequestMethod.GET)
	private User getUser() {
		
		user.setId(1);
		user.setJob("Professor");
		user.setName("Carlos");
		
		return user;
	}
}
