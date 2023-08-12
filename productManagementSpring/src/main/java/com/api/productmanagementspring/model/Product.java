package com.api.productmanagementspring.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product", schema = "public")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String name;
    private String type;
    private String location;
    private String description;
}
