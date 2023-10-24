package com.example.vente.request.pannier;

import lombok.Data;

import java.util.List;


@Data

public class CreatePannierReq {
    private int Id;
    private int user_id;
    private int[] products_id;

}
