package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> listaLivros; 

    public CatalogoLivros(){
        this.listaLivros = new ArrayList<Livro>();

    }

    public void adicionarLivro(String nome, String autor, int anoPublicao){
        Livro livro = new Livro(nome, autor, anoPublicao);
        this.listaLivros.add(livro);
    }

    public ArrayList<Livro> pesquisarPorAutor(String autor){

        ArrayList<Livro> livros = new ArrayList<Livro>();
        for (Livro livro : listaLivros) {
            if(livro.getAutor() == autor){
                livros.add(livro);
            }
        }

        return livros;
    }

    public ArrayList<Livro> pesquisarPorTitulo(String titulo){

        ArrayList<Livro> livros = new ArrayList<Livro>();
        for (Livro livro : listaLivros) {
            if(livro.getTitulo() == titulo){
                livros.add(livro);
            }
        }

        return livros;
    }

    public ArrayList<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        ArrayList<Livro> livros = new ArrayList<Livro>();
        for (Livro livro : listaLivros) {
            if(livro.getAnoPublicao() >= anoInicial && livro.getAnoPublicao() <= anoFinal){
                livros.add(livro);
            }
        }

        return livros;
    }

    public void imprimeListaLivros(ArrayList<Livro> lista){
        for (Livro livro : lista) {
            System.out.println(livro.getTitulo());
            System.out.println(livro.getAutor());
            System.out.println(livro.getAnoPublicao());
        }
    }


    public static void main(String args[]){

        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("O nome do vento", "Patrick Rothfuss", 2007);
        catalogo.adicionarLivro("O Último Desejo", "Andrzej Sapkowski", 1993);
        catalogo.adicionarLivro("A espada do destino", "Andrzej Sapkowski", 1992);
        catalogo.adicionarLivro("Dom Casmurro", "Machado de Assis", 1899);
    
        ArrayList<Livro> lista = catalogo.pesquisarPorTitulo("O nome do vento");

        catalogo.imprimeListaLivros(lista);

        lista = catalogo.pesquisarPorAutor("Andrzej Sapkowski");
        
        catalogo.imprimeListaLivros(lista);
        
        lista = catalogo.pesquisarPorIntervaloAnos(1890, 2002);
        
        catalogo.imprimeListaLivros(lista);
        

    }


}
