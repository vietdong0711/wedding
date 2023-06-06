package com.example.wedding.response;

import lombok.Data;

@Data
public class TotalResponse {
    private double totalProduct;

    private double totalMenu;

    private double totalGift;

    public TotalResponse(double totalProduct, double totalMenu, double totalGift) {
        this.totalGift = totalGift;
        this.totalProduct = totalProduct;
        this.totalMenu = totalMenu;
    }
}
