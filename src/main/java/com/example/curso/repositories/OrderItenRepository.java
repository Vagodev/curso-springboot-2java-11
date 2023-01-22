package com.example.curso.repositories;

import com.example.curso.entities.Order;
import com.example.curso.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItenRepository extends JpaRepository<OrderItem, Long>{
  
}
