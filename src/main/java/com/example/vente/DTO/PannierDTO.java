package com.example.vente.DTO;

public class PannierDTO {
    private Double totalPrice;


    public PannierDTO(Double totalPrice) {
        this.totalPrice = totalPrice;

    }


    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

