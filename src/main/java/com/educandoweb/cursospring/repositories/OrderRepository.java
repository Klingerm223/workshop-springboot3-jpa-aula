package com.educandoweb.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
	
}
