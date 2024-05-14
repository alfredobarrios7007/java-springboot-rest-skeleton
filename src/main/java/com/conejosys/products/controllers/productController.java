/**
 * 
 */
package com.conejosys.products.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.conejosys.products.models.Product;
import com.conejosys.products.services.IProductService;

/**
 * 
 */
@CrossOrigin(origins = "*")
@RestController
public class productController {

	@Autowired
	IProductService service;

	
	@GetMapping(value = "product", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> get() {
		System.out.println("productController - get");
		
		return service.getAll();
	}
	
	@GetMapping(value = "product/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product get(@PathVariable("id") int id) {
		System.out.println("productController - getById");
		
		return service.getById(id);
	}
	
	@PostMapping(value = "product", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String post(@RequestBody Product product) {
		UUID uuid = UUID.randomUUID();
		product.setUuid(uuid.toString());
		System.out.println("productController - post perform: " + product.toString());
		return String.valueOf(service.insert(product));
	}
	
	@PutMapping(value = "product", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public String put(@RequestBody Product product) {
		System.out.println("productController - put perform: " + product.toString());
		
		return String.valueOf(service.update(product));
	}
	
	@DeleteMapping(value = "product/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String delete(@PathVariable("id") int id) {
		System.out.println("productController - delete perform: " + id);
		
		return String.valueOf(service.delete(id));
	}

}
