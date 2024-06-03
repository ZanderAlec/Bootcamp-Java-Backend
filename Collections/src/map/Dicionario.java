package map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> palavras;

    public Dicionario(){
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        this.palavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!this.palavras.isEmpty())
            this.palavras.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(this.palavras);
    }

    public String pesquisarPorPalavra(String palavra){
        String significado = null;

        if(!this.palavras.isEmpty())
            significado = this.palavras.get(palavra);
        
        return significado;
    }

    public static void main(String args[]){
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("bruguelo", "Menino novinho; garoto.");
        dicionario.adicionarPalavra("titeriteiro", "Que faz espetáculos com títeres, tipo de boneco articulado movido por fios; titereiro.");
        dicionario.adicionarPalavra("natio", "Terra onde brotam plantas sem cultura prévia.");
    
        dicionario.exibirPalavras();
        
        dicionario.removerPalavra("natio");
        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("bruguelo"));
    }
}
