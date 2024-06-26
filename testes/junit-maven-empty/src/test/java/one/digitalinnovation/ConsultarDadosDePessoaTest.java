package one.digitalinnovation;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoaTest {
    
    //o método é executado antes do início dos testes. (1 vez)
    @BeforeAll
    static void configuraConexao(){
        BancoDeDados.iniciarConexao();
    }

    // O método é executado toda vez antes do inicio de cada teste executado.
    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.insereDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }

    //O método é executado toda vez ao final de cada teste executado.
    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("João", LocalDate.of(2000, 1, 1)));
    }

    @Test
    void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }
    

    //Executado quando todos os testes finalizam com o objetivo de liberar recursos.
    //(uma vez)
    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}


