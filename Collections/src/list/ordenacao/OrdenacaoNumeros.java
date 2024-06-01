import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros(){
        this.numeros = new ArrayList<Integer>(); 
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public void ordenarAscendente(){
        Collections.sort(this.numeros, new CompareMaior());
    }

    public void ordenarDescendente(){
        Collections.sort(this.numeros, new CompareMenor());
    }


    public void imprimeNumeros(){

        for (Integer numero : this.numeros) {
            System.out.println(numero);
        }

        System.out.println("--------------------------------");
    }


    public static void main(String args[]){
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros();

        ordenacao.adicionarNumero(1);
        ordenacao.adicionarNumero(21);
        ordenacao.adicionarNumero(55);
        ordenacao.adicionarNumero(121);
        ordenacao.adicionarNumero(12);
        ordenacao.adicionarNumero(15);
        ordenacao.adicionarNumero(2);
        ordenacao.adicionarNumero(0);
        ordenacao.adicionarNumero(20);

        ordenacao.imprimeNumeros();
        
        ordenacao.ordenarAscendente();
    
        ordenacao.imprimeNumeros();

        ordenacao.ordenarDescendente();
        ordenacao.imprimeNumeros();
    
    }
}
