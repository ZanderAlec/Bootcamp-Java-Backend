package com.gof.singleton;


public class SingletonLazyHolder {

    //Se diferencia das anteriores pela criação de uma classe interna
    //que será responsável pela instância:
    //encapsular essa instância é a única função.
    private static class InstanceHolder{
       public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
   
    private  SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstancia(){
        return InstanceHolder.instancia;
    }
}
