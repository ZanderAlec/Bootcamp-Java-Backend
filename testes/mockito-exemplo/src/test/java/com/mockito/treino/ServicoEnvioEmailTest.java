package com.mockito.treino;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ServicoEnvioEmailTest {
    @Mock
    private PlataformaDeEnvio plataforma;

    @InjectMocks
    private ServicoEnvioEmail servico;

    //Classe utilizada para capturar argumentos passados nas chamadas.
    @Captor 
    private ArgumentCaptor<Email> captor;

    @Test
    public void validarDadosEnviadosParaPlataforma(){
        String enderecoEmail = "usuario@teste.com.br";
        String mensagem = "Olá mundo!!";
        boolean ehHtml = false;

        servico.enviaEmail(enderecoEmail, mensagem, ehHtml);

        Mockito.verify(plataforma).enviaEmail(captor.capture());

        Email emailCapturado = captor.getValue();

        Assertions.assertEquals(enderecoEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());
    }
}
