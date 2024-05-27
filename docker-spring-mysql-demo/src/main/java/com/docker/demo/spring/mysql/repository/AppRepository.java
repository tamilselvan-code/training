package com.docker.demo.spring.mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.demo.spring.mysql.entity.Address;

@Repository
public interface AppRepository extends JpaRepository<Address, Long> {

}
