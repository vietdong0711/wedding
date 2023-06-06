package com.example.wedding.response;

import lombok.Data;

@Data
public class ProductResponse {

    private Long id;

    private String name;

    private double price;

    private int quantity;

    private String unit;

    private String type;
}
