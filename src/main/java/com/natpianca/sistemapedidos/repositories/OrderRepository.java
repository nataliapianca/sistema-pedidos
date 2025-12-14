package com.natpianca.sistemapedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.natpianca.sistemapedidos.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
