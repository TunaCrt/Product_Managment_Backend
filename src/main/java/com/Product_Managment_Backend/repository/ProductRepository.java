package com.Product_Managment_Backend.repository;

import com.Product_Managment_Backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
