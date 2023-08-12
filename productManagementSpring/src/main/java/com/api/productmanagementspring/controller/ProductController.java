package com.api.productmanagementspring.controller;


import com.api.productmanagementspring.model.Product;
import com.api.productmanagementspring.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class ProductController
{
    private final ProductService productService;

    /**
     * creating constructor for ProductRepository class to get auto-injected into ProductService class
     */
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * method to get a product from database using its id
     * If the product is found, return the product with Http status code 200;
     * otherwise, return a "Not Found" response with Http status code 401.
     */
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        Optional<Product> optionalProduct = productService.getProductById(id);
        if(optionalProduct.isPresent()){
            Product product = optionalProduct.get();
            return ResponseEntity.ok(product);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }

    }

    /**
     * method to create  a product and store in the database
     * If the request body is valid return the product with Http status code 201;
     * otherwise, return a "Bad Request" response with Http status code 400.
     */
    @PostMapping("products/add_new")
    public ResponseEntity<Product> addNewProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.addNewProduct(product),
                HttpStatus.CREATED);
    }
}
