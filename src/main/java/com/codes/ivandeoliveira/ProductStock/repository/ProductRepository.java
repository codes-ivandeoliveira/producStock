package com.codes.ivandeoliveira.ProductStock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codes.ivandeoliveira.ProductStock.ententies.Product;
import com.codes.ivandeoliveira.ProductStock.ententies.Stock;





public interface ProductRepository extends JpaRepository<Stock, Integer>  {

}
