package com.gof.singleton;

/**
 * Eager Singleton
 */
public class SingletonEager {

    //Se diferencia do "lazy" por ja instanciar na criação:
    private static SingletonEager instancia = new SingletonEager();

    private  SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
