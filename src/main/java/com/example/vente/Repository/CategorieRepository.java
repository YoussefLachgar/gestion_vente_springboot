package com.example.vente.Repository;

import com.example.vente.Entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<CategoryEntity, Integer> {
}
