package com.educandoweb.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
	
}
