import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas(){
        this.palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        this.palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        for(String p : palavras) {
            if(p.equals(palavra)){
                this.palavras.remove(p);
                break;
            }
        }
    }

    public boolean verificarPalavra(String palavra){
        for (String p : palavras) {
            if(p.equals(palavra)){
                return true;
            }
        }

        return false;
    }

    public void exibirPalavrasUnicas(){
        System.out.println(this.palavras);
    }

    public static void main(String args[]){
        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("sapo");
        palavrasUnicas.adicionarPalavra("garfo");
        palavrasUnicas.adicionarPalavra("figo");
        palavrasUnicas.adicionarPalavra("figo");
        palavrasUnicas.adicionarPalavra("magro");

        palavrasUnicas.exibirPalavrasUnicas();

        palavrasUnicas.removerPalavra("garfo");

        palavrasUnicas.exibirPalavrasUnicas();

        System.out.println(palavrasUnicas.verificarPalavra("sapo"));


    }
}
