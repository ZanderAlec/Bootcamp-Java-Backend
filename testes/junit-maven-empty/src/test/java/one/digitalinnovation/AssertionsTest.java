package one.digitalinnovation;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class AssertionsTest {

    @Test
    void validarLancamento(){
        int[] primeirolancamento = {10,20,30,40,50};
        int[] segundolancamento = {10,5,2,3,10};

        //Verifica se 2 arrays são iguais(na ordem dos índices);
        // Assertions.assertArrayEquals(primeirolancamento, segundolancamento);
        
        
        Assertions.assertNotEquals(primeirolancamento, segundolancamento);
    }

    @Test
    void validarObjetoNulo(){
        Pessoa pessoa = null;

        Assertions.assertNull(pessoa);
        
        Pessoa pessoa2 = new Pessoa("Fulano", LocalDate.now());
        Assertions.assertNull(pessoa2);
        
    }


    @Test
    void validarNumerosDeTiposDiferentes(){
        double valor = 0.5;
        double outroValor = 0.5;

        Assertions.assertEquals(valor, outroValor);
    }

    @Test
    //Condicionais permitem habilitar ou desabilitar a execução dos testes.
    //habilita o teste se o usuário for  "root"
    @EnabledIfEnvironmentVariable(named =  "USER", matches = "root")
    //desabilita o teste se o usuário for "root"
    @DisabledIfEnvironmentVariable(named =  "USER", matches = "root") 
    //habilita o teste baseado no sistema operacional
    //aceita array
    @EnabledOnOs(OS.WINDOWS)
    //habilita o teste baseado na versão do java.
    @EnabledOnJre(JRE.JAVA_10)
    void validaAlgo(){

    }
}
