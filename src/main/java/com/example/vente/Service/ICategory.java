package com.example.vente.Service;

import com.example.vente.Entity.CategoryEntity;
import com.example.vente.request.category.CreateCategoryReq;
import com.example.vente.request.category.UpdateCategoryReq;

import java.util.Optional;

public interface ICategory {
    CategoryEntity save(CreateCategoryReq cat);
    CategoryEntity update(UpdateCategoryReq cat);
    void delete(int id);
    Optional<CategoryEntity> getcategorie(int id);
}
