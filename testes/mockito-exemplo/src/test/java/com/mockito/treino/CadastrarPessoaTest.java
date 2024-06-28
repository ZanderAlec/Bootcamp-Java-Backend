package com.mockito.treino;


import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

@RunWith(MockitoJUnitRunner.class)
public class CadastrarPessoaTest {

    @Mock
    private ApiDosCorreios apiDosCorreios;

    //ApiDosCorreios possui uma instancia dentro de CadastrarPessoa
    //como api é na verdade um mock, precisamos injetar esse mock no lugar da instancia.
    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    public void validarDadosDeCadastro(){
        
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep(anyString()))
        .thenReturn(
            new DadosLocalizacao("MG", "patos de minas", "rua 2", "apartamento", "centro")
        );

        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Jorge", "1245234234", LocalDate.now(), "2312313");

        assertEquals("Jorge", pessoa.getNome());
        assertEquals("1245234234", pessoa.getDocumento());
        assertEquals("MG", pessoa.getEndereco().getUf());
        assertEquals("apartamento", pessoa.getEndereco().getComplemento());
    }

}
