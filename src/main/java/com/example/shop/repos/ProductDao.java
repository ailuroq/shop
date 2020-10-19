package com.example.shop.repos;

import com.example.shop.domain.Product;
import com.example.shop.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Long> {
    Product findByName(String name);
}
