package com.ashwani.shopping.bingo.auth.service;

public interface SecurityService {
    String findLoggedInUsername();

    void autologin(String username, String password);
}
