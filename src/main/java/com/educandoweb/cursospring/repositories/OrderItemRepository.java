package com.educandoweb.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursospring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem , Long>{

	
	
}
