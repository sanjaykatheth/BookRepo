package com.example.Book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Book.Entity.BookEntity;

public interface BookRepository extends JpaRepository<Integer, BookEntity> {

}
