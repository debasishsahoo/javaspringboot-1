package com.example.demo.controller;
//Handles HTTP requests
//Talks to service layer
//No business logic

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
@CrossOrigin("*")
public class ProductController {
	  private final ProductService service;
	  
	
	  
	  //POST http://localhost:8000/api/products/
	  @PostMapping
	    public Product create(@RequestBody Product product) {
	        return service.create(product);
	    }
	  
	  //GET http://localhost:8000/api/products/
	  @GetMapping
	    public List<Product> getAll() {
	        return service.getAll();
	    }
	  
	    //GET http://localhost:8000/api/products/242314123
	   @GetMapping("/{id}")
	    public Product getById(@PathVariable Long id) {
	        return service.getById(id);
	    }
	  
	   //PUT http://localhost:8000/api/products/242314123 
	   // Request Body 
	   @PutMapping("/{id}")
	    public Product update(@PathVariable Long id, @RequestBody Product product) {
	        return service.update(id, product);
	    }
	  
	   //DELETE http://localhost:8000/api/products/242314123 
	   @DeleteMapping("/{id}")
	    public void delete(@PathVariable Long id) {
	        service.delete(id);
	    }
  
}
