package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTest {
    
    @Test
    void validarCenarioExceptionTransferencia(){
        Conta origem = new Conta("123456", 0);
        Conta destino = new Conta("456789", 100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();
        
        /*verifica uma exceção
            parametros:     
                1 - tipo experado de exceção
                2 - método que lançará a exceção
        */
        Assertions.assertThrows(IllegalArgumentException.class, () -> transferenciaEntreContas.transfere(origem, destino, -1));
        
        //verifica se uma exceção não será lançada
        Assertions.assertDoesNotThrow(() -> transferenciaEntreContas.transfere(origem, destino, -1));
    }
}
