package com.ashwani.shopping.bingo.auth.service;

import com.ashwani.shopping.bingo.auth.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
