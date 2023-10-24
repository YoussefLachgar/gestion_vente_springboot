package com.example.vente.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "Categories")

public class CategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    private String name;

    private String description;

    private String grimage;

    private String ptimage;


    @ManyToMany(mappedBy = "categories")
    private List<ProductEntity> products;


    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getGrimage() {
        return grimage;
    }

    public String getPtimage() {
        return ptimage;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }
}
