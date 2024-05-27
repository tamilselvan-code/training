package com.docker.demo.spring.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.docker.demo.spring.mysql.entity.Address;
import com.docker.demo.spring.mysql.service.AppService;

@RestController
public class AppController {

	@Autowired
	private AppService appService;

	@GetMapping("/list")
	public List<Address> findAll() {
		return appService.findAll();
	}
	
	@PostMapping("/add")
	public void addAddress(@RequestBody Address address) {
		appService.add(address);
	}

}
