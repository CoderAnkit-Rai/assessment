package com.capg.BookService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capg.BookService.entity.Book;
import com.capg.BookService.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return service.save(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAll();
    }


    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        return service.update(book);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        service.delete(id);
        return "Book Deleted Successfully";
    }
}