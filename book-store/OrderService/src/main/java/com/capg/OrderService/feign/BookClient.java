package com.capg.OrderService.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.capg.OrderService.dto.Book;



@FeignClient(name = "BOOK-SERVICE")
public interface BookClient {

    @GetMapping("/books/{id}")
    Book getBook(@PathVariable Long id);
}
