package com.example.vente.request.product;

import lombok.Data;

import java.util.List;
@Data

public class CreateProductReq {
    private int Id;


    List<String> product_images;
    private  String title;
    private String description;
    private int quantite;

}
