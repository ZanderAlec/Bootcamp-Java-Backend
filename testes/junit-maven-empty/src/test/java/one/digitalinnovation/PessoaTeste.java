package one.digitalinnovation;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTeste {

    @Test
    void validarCalculoIdade(){

        //Criação do cenário
        Pessoa pessoa = new Pessoa("Victor", LocalDate.of(2020, 1, 1));
        
        //Validações
        assertEquals(4, pessoa.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade(){
        Pessoa pessoa = new Pessoa("Victor", LocalDate.of(2000, 1, 1));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());
        
        Pessoa pessoa2 = new Pessoa("paulo", LocalDate.now());
        Assertions.assertFalse(pessoa2.ehMaiorDeIdade());
    }
}
