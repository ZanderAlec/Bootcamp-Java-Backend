package com.mockito.treino;

import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ListaTest {

    @Mock
    private List<String> letras;

    @Test
    public void adicionarItemNaLista(){
        //retorna algo quando uma ação é executada
        //mock
        Mockito.when(letras.get(0)).thenReturn("B");

        Assertions.assertEquals("B", letras.get(0));
    }
}
