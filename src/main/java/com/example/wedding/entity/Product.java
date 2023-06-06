package com.example.wedding.entity;

import com.example.wedding.request.ProductRequest;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private double price;

    private int quantity;

    private String unit;

    private Type type;

    public Product(ProductRequest request){
        this.id = request.getId();;
        this.name = request.getName();
        this.price = request.getPrice();
        this.type = Type.valueOf(request.getType());
        this.unit = request.getUnit();
        this.quantity = request.getQuantity();
    }
}
