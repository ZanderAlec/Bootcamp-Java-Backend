package com.mockito.treino;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EnviarMensagemTest {

    //serve para observar o comportamento de uma instância real de uma classe, ao invés de criar um falso(mock)
    @Spy
    private EnviarMensagem enviarMensagem;

    @Test
    public void VerificarComportamentoDaClasse(){
        Mockito.verifyNoInteractions(enviarMensagem);
        
        Mensagem mensagem = new Mensagem("Hello World");
        enviarMensagem.adicionarMensagem(mensagem);

                //verifica a chamada do objeto
                                        //ação executada
        Mockito.verify(enviarMensagem).adicionarMensagem(mensagem);

        Assertions.assertFalse(enviarMensagem.getMensagens().isEmpty());
    }
}
