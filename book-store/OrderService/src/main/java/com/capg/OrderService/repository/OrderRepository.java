package com.capg.OrderService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.OrderService.entity.BookOrder;

public interface OrderRepository extends JpaRepository<BookOrder, Long> {
	
	
}
