package com.spring_security.config;

import java.util.HashSet;

import org.hibernate.mapping.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring_security.model.User;
import com.spring_security.repository.UserRepository;

@Service
public class SecurityDatabaseService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Override
    //UserDetails é parte do core do spring.
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //procura o usuário no banco
        User userEntity = userRepository.findByUsername(username);
        if(userEntity == null)
            throw new UsernameNotFoundException(username);

        
        HashSet<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
        //perfis que o usuário possui (o que pode acessar)
        userEntity.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
        });

                                //A declaração precisa ser explícita pra evitar conflitos.
        UserDetails user = new org.springframework.security.core.userdetails.User(
            userEntity.getUsername(),
            userEntity.getPassword(),
            authorities
        );

        return user;
    }

}
