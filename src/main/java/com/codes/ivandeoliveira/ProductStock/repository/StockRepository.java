package com.codes.ivandeoliveira.ProductStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codes.ivandeoliveira.ProductStock.ententies.Product;





public interface StockRepository extends JpaRepository<Product, Integer>  {

}
