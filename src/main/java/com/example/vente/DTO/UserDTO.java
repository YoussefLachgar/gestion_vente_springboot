package com.example.vente.DTO;

public class UserDTO {
    private String username;
    private String email;
    private Number numero;
    private String role;

    public UserDTO(String username, String email, Number numero, String role) {
        this.username = username;
        this.email = email;
        this.numero = numero;
        this.role = role;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Number getNumero() {
        return numero;
    }

    public void setNumero(Number numero) {
        this.numero = numero;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
