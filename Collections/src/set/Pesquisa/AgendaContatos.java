package Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos(){
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        this.contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(this.contatos);
    }

    public void pesquisarPorNome(String nome){
        for (Contato contato : this.contatos) {
            if(contato.getNome().equals(nome)) 
                System.out.println(contato);
        }
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        for (Contato contato : this.contatos) {
            if(contato.getNome().equals(nome)){
                contato.setNumeroTelefone(novoNumero);
            }
        }
    }


    public static void main(String args[]){
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("flavio", 986256677);
        agenda.adicionarContato("bruna", 986256677);
        agenda.adicionarContato("amanda", 986256622);
        agenda.adicionarContato("amanda", 986254455);
        agenda.adicionarContato("pedro", 923426677);

        agenda.exibirContatos();
        
        agenda.pesquisarPorNome("amanda");
        
        agenda.atualizarNumeroContato("pedro", 923426672);
        
        agenda.exibirContatos();
    }
}
