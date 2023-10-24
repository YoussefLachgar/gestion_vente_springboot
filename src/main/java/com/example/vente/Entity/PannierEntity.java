package com.example.vente.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Panniers")

public class PannierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;


    private Double totalPrice;



    @ManyToMany(mappedBy = "panniers")
    private List<ProductEntity> products;

    @ManyToOne
    private UserEntity user;








}
