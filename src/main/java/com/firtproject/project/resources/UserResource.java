package com.firtproject.project.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firtproject.project.entities.User;

@RestController
@RequestMapping(value="/user")
public class UserResource {
	
	@GetMapping 
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"ricaro", "ricardo@gmail.","999", "123456");
		return ResponseEntity.ok().body(u);
	}

}
