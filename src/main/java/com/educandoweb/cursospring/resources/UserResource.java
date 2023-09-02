package com.educandoweb.cursospring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.cursospring.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll () {
		User u = new User(1L,"Klinger","klingecm@hotmail.com","92138837","123456" );
		return ResponseEntity.ok().body(u);
	}
}
