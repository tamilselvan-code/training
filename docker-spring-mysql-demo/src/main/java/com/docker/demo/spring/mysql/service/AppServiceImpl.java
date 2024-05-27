package com.docker.demo.spring.mysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.docker.demo.spring.mysql.entity.Address;
import com.docker.demo.spring.mysql.repository.AppRepository;

@Service
public class AppServiceImpl implements AppService {
	
	
	@Autowired
	private AppRepository appRepository;

	@Override
	public void add(Address address) {
		appRepository.save(address);
	}

	@Override
	public List<Address> findAll() {
		return appRepository.findAll();
	}

}
