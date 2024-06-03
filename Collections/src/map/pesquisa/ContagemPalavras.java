import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContagemPalavras {
    private Map<String, Integer> contagem;

    public ContagemPalavras(){
        this.contagem = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.contagem.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!this.contagem.isEmpty())
            this.contagem.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(this.contagem);
    }

    public String encontrarPalavraMaisFrequente(){
        String maisFrequente= null;
        int frequencia = Integer.MIN_VALUE;

        for (String palavra: this.contagem.keySet()) {
            if(this.contagem.get(maisFrequente) > frequencia){
                frequencia = this.contagem.get(maisFrequente);
                maisFrequente = palavra;

            }
        }

        return maisFrequente;
    }
}
