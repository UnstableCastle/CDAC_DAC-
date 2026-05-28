package com.app.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Book1")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;

    private String author;

    private float price;

    @ManyToOne(cascade = CascadeType.ALL)
    private Shop shop;

    public Book(String title, String author, float price, Shop shop) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.shop = shop;
    }
}