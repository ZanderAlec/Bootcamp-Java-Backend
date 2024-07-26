package com.spring_security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    //rota inicial
    @GetMapping
    public String welcome(){
        return "Welcome to My Spring Boot Web API";
    }

    @GetMapping("/users")
    //determina quais roles podem acessar qual aplicação.
    //deve ser feito para cada tipo de usuário. Existem opções melhores.
    // @PreAuthorize("hasAnyRole('MANAGERS','USERS')")
    public String users(){

        return "Autorized user";
    }

    @GetMapping("/managers")
    //determina que apenas um tipo de perfil possa acessar
    // @PreAuthorize("hasRole('MANAGERS')")
    public String managers(){
        return "Autorized Manager";
    }
}
