package com.gof.singleton;

/**
 * Lazy Singleton
 */
public class SingletonLazy {
    //Não disponibiliza imediatamente a instância pro usuário.
    //Possui uma instância de si mesmo.
    private static SingletonLazy instancia;

    //o construtor do singleton é privado.
    private  SingletonLazy(){
        super();
    }

    //disponibiliza a instância para a aplicação:
    public static SingletonLazy getInstancia(){
        if(instancia == null)
            instancia = new SingletonLazy();
            
        return instancia;
    }

}
