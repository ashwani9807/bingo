package com.ashwani.shopping.bingo.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashwani.shopping.bingo.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}