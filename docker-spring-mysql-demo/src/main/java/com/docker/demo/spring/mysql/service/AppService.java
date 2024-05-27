package com.docker.demo.spring.mysql.service;

import java.util.List;

import com.docker.demo.spring.mysql.entity.Address;

public interface AppService {

	public void add(Address address);

	public List<Address> findAll();
}
