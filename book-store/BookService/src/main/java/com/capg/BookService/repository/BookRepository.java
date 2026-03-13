package com.capg.BookService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.BookService.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	
	
}