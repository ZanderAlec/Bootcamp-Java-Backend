package com.spring_security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

//Define como um componente de configuração.
@Configuration
//habilita a segurança web de forma manual. É essa classe que fará o gerenciamento.
@EnableWebSecurity
//Essa anotação também foi descontinuada.
//Habilita recursos globais de validações de segurança.
@EnableGlobalMethodSecurity(prePostEnabled = true)  
                                    //essa implementação foi descontinuada.
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    //utilizado para acesso dos usuários no BD:
    @Autowired
    private SecurityDatabaseService securityService;

    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception{
                //gerenciador de autenticações que utiliza o security service.
                                                                //define as estratégias de criptografia.
        auth.userDetailsService(securityService).passwordEncoder(NoOpPasswordEncoder.getInstance());
    }

    //====================================================================================
    //sobrescrever esse método para adicionar as configurações básicas de segurança.
    //Essa implementação é pra adicionar as credenciais em MEMÓRIA.
    // @Override
    // protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    //     //Cria uma cadeia de usuários em memória
    //    //é o que permitirá criar os usuários para teste.
    //    auth.inMemoryAuthentication()
    //    .withUser("user")
    //                         //noop é o tipo de criptografia.
    //                         //O spring possui várias.
    //    .password("{noop}user123")
    //    .roles("USERS")
    //    .and()
    //    .withUser("admin")
    //    .password("{noop}master123")
    //    .roles("MANAGERS"); 
    // }


    //permite definir as permissões de maneira mais simples que usando um controller:
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.authorizeRequests()
            //define a rota                 //define quem acessa
            .antMatchers("/").permitAll()
                        //define que o login só aceite requisições de post
            .antMatchers(HttpMethod.POST, "/login").permitAll()
            .antMatchers("/managers").hasRole("MANAGERS")
            .antMatchers("/users").hasAnyRole("MANAGERS", "USERS")
                                            //o tipo de autenticação:
            // .anyRequest().authenticated().and().formLogin();
            .anyRequest().authenticated().and().httpBasic();
    }

}