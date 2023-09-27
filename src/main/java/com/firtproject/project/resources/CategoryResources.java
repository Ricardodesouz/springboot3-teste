package com.firtproject.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firtproject.project.entities.Category;
import com.firtproject.project.services.CategoryService;

@RestController
@RequestMapping(value="/Category")
public class CategoryResources {
	@Autowired
	private CategoryService service;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		return ResponseEntity.ok().body(service.findAll());	
	}
	@GetMapping(value="/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id ){
		return ResponseEntity.ok().body(service.findById(id));

	}
}
