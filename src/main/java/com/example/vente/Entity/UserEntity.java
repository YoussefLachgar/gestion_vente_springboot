package com.example.vente.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users")

public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;


    private String username;


    private Number numero;


     @Email

    private String email;


     private String Password;


     private String role;


    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<PannierEntity> panniers;

}
