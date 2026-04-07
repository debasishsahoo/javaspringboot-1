package com.example.demo.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	
	private final ProductRepository repo;
	
	public Product create(Product product) {
		return repo.save(product);
	}
	
	public List<Product> getAll(){
		return repo.findAll();
	}
	
	public Product getById(Long id){
		return repo.findById(id).orElseThrow(()->new RuntimeException("Product not found"));
	}
	
	public Product update(Long id,Product product){
		Product existing = getById(id);
		existing.setName(product.getName());
		existing.setPrice(product.getPrice());
		return repo.save(existing);
	}
	
	 public void delete(Long id) {
	        repo.deleteById(id);
	    }

	
}
