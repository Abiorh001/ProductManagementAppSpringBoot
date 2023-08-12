package com.api.productmanagementspring.repository;

import com.api.productmanagementspring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
