package com.mypackage.demoMysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypackage.demoMysql.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}