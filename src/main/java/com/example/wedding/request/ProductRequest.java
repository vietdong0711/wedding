package com.example.wedding.request;

import lombok.Data;

@Data
public class ProductRequest {

    private Long id;

    private String name;

    private double price;

    private int quantity;

    private String unit;

    private String type;
}
