package com.example.vente.Controller;

import com.example.vente.Entity.CategoryEntity;
import com.example.vente.Service.CategoryService;
import com.example.vente.request.category.CreateCategoryReq;
import com.example.vente.request.category.UpdateCategoryReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/categories")
public class CategorieController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public CategoryEntity createCategory(@RequestBody CreateCategoryReq category) {
        return categoryService.save(category);
    }

    @GetMapping("/{id}")
    public Optional<CategoryEntity> getCategory(@PathVariable int id) {
        return categoryService.getcategorie(id);
    }

    @PutMapping("/update")
    public CategoryEntity updateCategory(@RequestBody UpdateCategoryReq req) {
        return categoryService.update(req);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable int id) {
        categoryService.delete(id);
    }
}
