package ordenacao;

import java.util.Comparator;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    
    @Override
    public int compareTo(Livro obj) {
        if(this.preco > obj.getPreco()) return 1;
        if(this.preco < obj.getPreco()) return -1;
        return 0;
    }


    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }
    
    public String getTitulo() {
        return titulo;
    }

}

class ComparebyAutor implements Comparator<Livro>{

    @Override
    public int compare(Livro p1, Livro p2) {
        return p1.getAutor().compareToIgnoreCase(p2.getAutor());
    }
    
}
