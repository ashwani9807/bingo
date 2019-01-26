package com.ashwani.shopping.bingo.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashwani.shopping.bingo.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
