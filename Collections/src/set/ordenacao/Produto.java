import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private String nome;
    private long cod;
    double preco;
    int quantidade;

    public Produto(String nome, long cod, double preco, int quantidade){
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    @Override
    public int compareTo(Produto p) {
        //vai comparar as duas strings e ordenar baseado nas letras iniciais de cada uma.
       return this.nome.compareToIgnoreCase(p.getNome());
    }


    public String getNome() {
        return nome;
    }

    public long getCod() {
        return cod;
    }
    
    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.getCod());
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Produto produto)) return false;
        return this.getCod() == produto.getCod();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Produto{codigo="+this.cod+", nome="+this.nome+", preco="+this.preco+", quantidade="+this.quantidade+"}";
    }


}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
       return Double.compare(p1.getPreco(), p2.getPreco());
    }

}
