package com.example.vente.request.user;

import jakarta.validation.constraints.Email;
import lombok.Data;

@Data

public class UpdateUserReq {
    private int Id;


    private String username;


    private Number numero;


    @Email

    private String email;


    private String Password;


    private String role;
}
