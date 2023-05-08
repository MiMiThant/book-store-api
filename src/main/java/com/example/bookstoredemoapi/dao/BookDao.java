package com.example.bookstoredemoapi.dao;

import com.example.bookstoredemoapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Integer> {
}
