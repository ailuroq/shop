package com.example.shop.repos;

import com.example.shop.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Long> {
    User findByUsername(String username);
}
