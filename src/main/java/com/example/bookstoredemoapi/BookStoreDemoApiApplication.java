package com.example.bookstoredemoapi;

import com.example.bookstoredemoapi.dao.CategoryDao;
import com.example.bookstoredemoapi.entity.Book;
import com.example.bookstoredemoapi.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@SpringBootApplication
public class BookStoreDemoApiApplication {
    @Autowired
    private CategoryDao categoryDao;

    @Transactional
    @Bean @Profile("h2")
    public ApplicationRunner runner(){
        return  args -> {
            Category c1=new Category();
            c1.setName("Historical");
            Category c2=new Category();
            c2.setName("Tragic");
            Category c3=new Category();
            c3.setName("Comedy");

            Book book1=new Book("World War 2",23.5,
                    LocalDate.of(2021,3,11),
                    "Sun",
                    "https://source.unsplash.com/366x200/?nature,water","HG Well");
            Book book2=new Book("A History of HumanBeings",30.5,
                    LocalDate.of(2021,3,11),
                    "Sun",
                    "https://source.unsplash.com/366x200/?coffee","HG Well");
            Book book3=new Book("Under the Greenwood Tree",30.5,
                    LocalDate.of(2021,3,11),
                    "Sun",
                    "https://source.unsplash.com/366x200/?coffee","Thomas Hardy");
            Book book4=new Book("A pair of blue eyes",22.5,
                    LocalDate.of(1956,3,11),
                    "Sun",
                    "https://source.unsplash.com/366x200/?coffee","Thomas Hardy");
            Book book5=new Book("Great Expectations",30.5,
                    LocalDate.of(1955,3,11),
                    "Moon",
                    "https://source.unsplash.com/366x200/?coffee","Charles Dickens");
            Book book6=new Book("A Tale of Tow Cities",30.5,
                    LocalDate.of(1960,3,11),
                    "Moon",
                    "https://source.unsplash.com/366x200/?coffee","Charles Dickens");

            c1.addBook(book1);
            c1.addBook(book2);
            c2.addBook(book6);
            c2.addBook(book5);
            c3.addBook(book3);
            c3.addBook(book4);

            categoryDao.save(c1);
            categoryDao.save(c2);
            categoryDao.save(c3);



        };
    }

    public static void main(String[] args) {
        SpringApplication.run(BookStoreDemoApiApplication.class, args);
    }

}
