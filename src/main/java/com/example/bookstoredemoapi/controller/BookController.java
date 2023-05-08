package com.example.bookstoredemoapi.controller;

import com.example.bookstoredemoapi.entity.Book;
import com.example.bookstoredemoapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/list-books")
    public List<Book> listAllBooks(){
        return bookService.findAllBooks();
    }
}
