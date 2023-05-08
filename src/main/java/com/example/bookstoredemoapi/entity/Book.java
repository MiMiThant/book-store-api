package com.example.bookstoredemoapi.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private double price;
    private LocalDate yearPublished;
    private String publisher;
    private String imagUrl;
    private String authorName;
    @ManyToOne
    private Category category;

    public Book(String title, double price, LocalDate yearPublished, String publisher, String imagUrl,
                String authorName) {
        this.title = title;
        this.price = price;
        this.yearPublished = yearPublished;
        this.publisher = publisher;
        this.imagUrl = imagUrl;
        this.authorName=authorName;
    }

    public Book(){

    }
}
