package com.capg.OrderService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.OrderService.entity.BookOrder;
import com.capg.OrderService.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public BookOrder create(BookOrder order){
        return repository.save(order);
    }

    public List<BookOrder> getAll(){
        return repository.findAll();
    }

    public BookOrder getById(Long id){
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }
}