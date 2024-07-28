package com.spring_security_jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring_security_jwt.model.User;
import com.spring_security_jwt.repository.UserRepository;

//Serviço para salvar o usuário no bd:
@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder encoder;

    public void createUser (User user){
        String pass = user.getPassword();

        //criptografa antes de salvar no banco:
        user.setPassword(encoder.encode(pass));
        repository.save(user);
    }
}
