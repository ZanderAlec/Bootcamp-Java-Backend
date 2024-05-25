package list.operacoesBasicas;

public class Item {
    private String nome;
    private int quantidade;
    private double preco;

    public Item(String nome, int quant, double preco){
        this.nome = nome;
        this.quantidade = quant;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
