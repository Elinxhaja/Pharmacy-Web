package com.pharmacyweb.pharmacyweb.Entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private double price;
}
