import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas{
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoas(){
        this.listaPessoas = new ArrayList<Pessoa>();   
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        Pessoa pessoa = new Pessoa(nome, idade, altura);

        this.listaPessoas.add(pessoa);
    }

    public void ordenarPorIdade(){
        Collections.sort(this.listaPessoas);
    }

    public void ordenarPorAltura(){
        Collections.sort(this.listaPessoas, new CompareByAltura());
    }

    public void imprimeListaPessoas(){
        System.out.println("------------------------------------------------------");

        for (Pessoa pessoa : listaPessoas) {
            System.out.println("nome: "+pessoa.getNome()+"| idade: "+pessoa.getIdade()+"| altura: "+pessoa.getAltura());
        }
    }


    public static void main(String args[]){
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Jorge", 3, 1.74);
        ordenacaoPessoas.adicionarPessoa("Amanda", 2, 1.24);
        ordenacaoPessoas.adicionarPessoa("Vitor", 1, 1.54);

        ordenacaoPessoas.imprimeListaPessoas();

        ordenacaoPessoas.ordenarPorIdade();
        ordenacaoPessoas.imprimeListaPessoas();

        ordenacaoPessoas.ordenarPorAltura();
        ordenacaoPessoas.imprimeListaPessoas();
        
    }


}
