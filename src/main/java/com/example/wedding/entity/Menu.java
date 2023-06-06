package com.example.wedding.entity;

import com.example.wedding.request.MenuRequest;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "menu")
@Data
@NoArgsConstructor
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private double price;

    public Menu(MenuRequest request){
        this.id = request.getId();
        this.name = request.getName();
        this.price = request.getPrice();
    }
}
