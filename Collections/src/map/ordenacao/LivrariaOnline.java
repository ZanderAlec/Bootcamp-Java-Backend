package ordenacao;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    private Map<String, Livro> catalogo;

    public LivrariaOnline(){
        this.catalogo = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor,  double preco){
        this.catalogo.put(link,new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        if(!this.catalogo.isEmpty())
            for (String chave : this.catalogo.keySet()) {
                Livro livro = this.catalogo.get(chave);
                if(livro.getTitulo().equals(titulo)){
                    this.catalogo.remove(chave);
                }
            }
    }

    public void  exibirLivrosOrdenadosPorPreco(){
        Map<String, Livro> ordenadoPorPreco = new TreeMap<>(this.catalogo);

        System.out.println(ordenadoPorPreco);
    }

  
}
