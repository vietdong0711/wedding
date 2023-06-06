package com.example.wedding.entity;

import com.example.wedding.request.GiftRequest;
import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "gift")
@Data
@NoArgsConstructor
public class Gift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private double price;

    public Gift(GiftRequest request){
        this.id = request.getId();
        this.price = request.getPrice();
    }
}
