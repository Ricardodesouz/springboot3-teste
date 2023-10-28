package com.firtproject.project.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.firtproject.project.entities.User;
import com.firtproject.project.services.UserService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
@RequestMapping(value="/user")
public class UserResource {
	
	@Autowired
	private UserService service;

	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value ="/{id}")
	public  ResponseEntity<User> findById(@PathVariable Long id ) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	@PostMapping
	public ResponseEntity<User> insert(@RequestBody User obj){
		obj = service.insert(obj);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();

		return ResponseEntity.created(location).body(obj);

	}
	@DeleteMapping(value ="/{id}")
	public ResponseEntity<User> delete(@PathVariable Long id ){
		service.delete(id);
		return ResponseEntity.noContent().build();

	}
	@PutMapping(value="/{id}")
	public  ResponseEntity<User> upateData(@PathVariable Long id, @RequestBody User obj){
		service.upadateData(id, obj);
		return ResponseEntity.ok().body(obj);
	}

}
