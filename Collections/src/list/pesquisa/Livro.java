package list.pesquisa;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicao;

    public Livro(String titulo, String autor, int anoPublicao){
        this.titulo = titulo;
        this.anoPublicao = anoPublicao;
        this.autor = autor;
    }

    public int getAnoPublicao() {
        return anoPublicao;
    }

    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }


}
