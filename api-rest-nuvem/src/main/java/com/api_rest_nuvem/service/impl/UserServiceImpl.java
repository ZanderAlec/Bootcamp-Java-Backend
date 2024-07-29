package com.api_rest_nuvem.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.api_rest_nuvem.domain.model.User;
import com.api_rest_nuvem.domain.repository.UserRepository;
import com.api_rest_nuvem.service.UserService;

@Service
//utilizar essa implementação evita que a interface de use seja exposta mais que o necessário.
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
       return userRepository.findById(id).orElseThrow(NoSuchElementException:: new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber()))
            throw new IllegalArgumentException("This Account Number already exists.");
        
        return userRepository.save(userToCreate);
    }

}
