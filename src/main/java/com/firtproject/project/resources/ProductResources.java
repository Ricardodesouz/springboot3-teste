package com.firtproject.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firtproject.project.entities.Product;
import com.firtproject.project.services.ProductService;

@RestController
@RequestMapping(value="/product")
public class ProductResources {
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		return ResponseEntity.ok().body(service.findAll());	
	}
	@GetMapping(value="/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id ){
		return ResponseEntity.ok().body(service.findById(id));

	}
}
