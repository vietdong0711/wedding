package com.example.wedding.entity;

import javax.persistence.*;

import com.example.wedding.request.CustomerRequest;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String phone;

    private String address;

    public Customer(CustomerRequest request){
        this.id = request.getId();
        this.name = request.getName();
        this.address = request.getAddress();
        this.phone = request.getPhone();
    }
}
