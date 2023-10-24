package com.example.vente.Controller;

import com.example.vente.Entity.ProductEntity;
import com.example.vente.Service.IProduct;
import com.example.vente.request.product.CreateProductReq;
import com.example.vente.request.product.UpdateProductReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProduct productService;

    @PostMapping
    public ProductEntity createProduct(@RequestBody CreateProductReq product) {
        return productService.save(product);
    }

    @GetMapping("/{id}")
    public Optional<ProductEntity> getProduct(@PathVariable int id) {
        return productService.getproduit(id);
    }

    @PutMapping("/{id}")
    public ProductEntity updateProduct( @RequestBody UpdateProductReq product) {

        return productService.update(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.delete(id);
    }
}
