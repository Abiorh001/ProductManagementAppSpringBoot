package com.api.productmanagementspring.service;


import com.api.productmanagementspring.model.Product;
import com.api.productmanagementspring.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService
{
    /**
     * creating an object reference of ProductRepository class
     */
   private final ProductRepository productRepository;

   /**
    * creating constructor for ProductRepository class to get auto-injected into ProductService class
    */
   public ProductService(ProductRepository productRepository){
       this.productRepository = productRepository;
   }

   /**
    * method to get a product from database using its id number
    */
   public Optional<Product> getProductById(int id){
       return productRepository.findById(id);
   }

    /**
     * method to create a product and save to the database
     */
   public Product addNewProduct(Product product){
       return productRepository.save(product);
   }

    /**
     * method to list all products in the database
     */
   public List<Product> getAllProducts(){
       return productRepository.findAll();
   }
}
