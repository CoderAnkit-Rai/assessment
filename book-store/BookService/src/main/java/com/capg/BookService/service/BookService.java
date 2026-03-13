package com.capg.BookService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.BookService.entity.Book;
import com.capg.BookService.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public Book save(Book book){
        return repository.save(book);
    }

    public List<Book> getAll(){
        return repository.findAll();
    }

    public Book getById(Long id){
        return repository.findById(id).orElse(null);
    }

    public Book update(Book book){
        return repository.save(book);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}