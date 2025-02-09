package com.mypackage.demoMysql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mypackage.demoMysql.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}