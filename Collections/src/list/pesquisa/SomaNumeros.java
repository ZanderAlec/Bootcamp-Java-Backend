package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Integer> numeros;
    

    public SomaNumeros(){
        this.numeros = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public int calcularSoma(){
        int total = 0;
        
        for (Integer num : numeros) {
            total += num;
        }

        return total;
    }

    public int encontrarMaiorNumero(){
        int maior = numeros.get(0);

        for(int i = 1; i < numeros.size(); i++){
           int  num = numeros.get(i);

            if(num > maior) 
                maior = num;
        }

        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = numeros.get(0);

        for(int i = 1; i < numeros.size(); i++){
           int  num = numeros.get(i);

            if(num < menor) 
                menor = num;
        }

        return menor;
    }

    public void exibirNumeros(){
        for (Integer num : numeros) {
            System.out.println(num);
        }
    }

    public static void main(String args[]){
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(4);
        numeros.adicionarNumero(8);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(9);
        numeros.adicionarNumero(7);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(1);

        numeros.exibirNumeros();
        System.out.println("\n soma: "+ numeros.calcularSoma());
        System.out.println("maior: "+ numeros.encontrarMaiorNumero());
        System.out.println("menor: "+ numeros.encontrarMenorNumero());




    }
}
