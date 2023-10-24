package com.example.vente.Service;

import com.example.vente.Entity.CategoryEntity;
import com.example.vente.Repository.CategorieRepository;
import com.example.vente.request.category.CreateCategoryReq;
import com.example.vente.request.category.UpdateCategoryReq;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService implements ICategory {
    @Autowired
   private CategorieRepository categorieRepo;



    @Override
    public Optional<CategoryEntity> getcategorie(int id) {
        return categorieRepo.findById(id);
    }

    @Override
    public CategoryEntity save(CreateCategoryReq cat) {

        CategoryEntity newCategory = new CategoryEntity();
        newCategory.setName(cat.getName());
        newCategory.setDescription(cat.getDescription());
        newCategory.setGrimage(cat.getGrimage());
        newCategory.setPtimage(cat.getPtimage());


        return categorieRepo.save(newCategory);
    }

    @Override
    public CategoryEntity update(UpdateCategoryReq req) {

        Optional<CategoryEntity> categoryOptional= categorieRepo.findById(req.getId());

        if (categoryOptional.isPresent()){
            CategoryEntity category = categoryOptional.get();
            category.setName(req.getName());
            category.setDescription(req.getDescription());
            category.setGrimage(req.getGrimage());
            category.setPtimage(req.getPtimage());
            return categorieRepo.save(category);
        }else {
            throw new EntityNotFoundException("Category not found for id: " + req.getId());
        }
    }

    @Override
    public void delete(int id) {
        Optional<CategoryEntity> categoryEntityOptional= categorieRepo.findById(id);
        if(categoryEntityOptional.isPresent()){
            categorieRepo.deleteById(id);
        }else {
            throw new EntityNotFoundException("Category not found for id: " + id);
        }
    }
}
