package com.example.vente.DTO;

import java.util.List;

public class ProductDTO {
    private List<String> productImages;
    private String title;
    private String description;
    private int quantite;


    public ProductDTO(List<String> productImages, String title, String description, int quantite) {
        this.productImages = productImages;
        this.title = title;
        this.description = description;
        this.quantite = quantite;
        // Initialize other fields here if needed
    }

    // Getters and Setters
    public List<String> getProductImages() {
        return productImages;
    }

    public void setProductImages(List<String> productImages) {
        this.productImages = productImages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
