package com.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Shop")
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int copies;

    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;

    public Shop(int copies) {
        this.copies = copies;
    }
}