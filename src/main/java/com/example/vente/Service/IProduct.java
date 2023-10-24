package com.example.vente.Service;

import com.example.vente.Entity.ProductEntity;
import com.example.vente.request.product.CreateProductReq;
import com.example.vente.request.product.UpdateProductReq;

import java.util.Optional;

public interface IProduct {
    ProductEntity save(CreateProductReq product);
    ProductEntity update(UpdateProductReq product);
    void delete(int id);
    Optional<ProductEntity> getproduit(int id);


}
