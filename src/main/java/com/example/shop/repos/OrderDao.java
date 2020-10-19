package com.example.shop.repos;

import com.example.shop.domain.Order;
import com.example.shop.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface OrderDao extends CrudRepository<Order,Long> {
    Order findById(Integer id);
}
