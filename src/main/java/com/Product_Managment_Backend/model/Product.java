package com.Product_Managment_Backend.model;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String productName;

    private String description;

    private Double price;

    private String status;
}
