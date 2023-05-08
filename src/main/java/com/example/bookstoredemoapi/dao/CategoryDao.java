package com.example.bookstoredemoapi.dao;

import com.example.bookstoredemoapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDao extends JpaRepository<Category,Integer> {
}
