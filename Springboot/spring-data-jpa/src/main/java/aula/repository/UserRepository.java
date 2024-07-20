package aula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import aula.model._User;

//jpa repository é uma interface que possui diversos métodos cuja proposta é 
//fazer a implementação de persistencia(CRUD) dos objetos.                                                              
public interface UserRepository extends JpaRepository<_User, Integer> {

}
