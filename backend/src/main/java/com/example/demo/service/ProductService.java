package com.example.demo.service;
//Core business logic
//Validation + processing
//Calls repository

import java.util.List;
import com.example.demo.model.Product;


public interface ProductService {
         Product create(Product product); // Create
         List<Product> getAll(); //Read or View
         Product getById(Long id); //Single View
         Product update(Long id,Product product); //Update
         void delete(Long id); //Delete
         
         
         
}
