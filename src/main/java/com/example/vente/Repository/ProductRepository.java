package com.example.vente.Repository;

import com.example.vente.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
