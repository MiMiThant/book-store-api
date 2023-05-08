package com.example.bookstoredemoapi.service;

import com.example.bookstoredemoapi.dao.BookDao;
import com.example.bookstoredemoapi.entity.Book;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public List<Book> findAllBooks(){
        return bookDao.findAll();
    }
    public void saveBook(Book book){
        bookDao.save(book);
    }
    public Book findBookById(int id){
        return bookDao.findById(id)
                .orElseThrow(EntityNotFoundException::new);
    }

}
