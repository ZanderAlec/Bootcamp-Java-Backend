package com.api_rest_nuvem.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api_rest_nuvem.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
