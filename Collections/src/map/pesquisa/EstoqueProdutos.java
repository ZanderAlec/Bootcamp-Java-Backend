import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoque;

    public EstoqueProdutos(){
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        Produto produto = new Produto(nome, quantidade, preco);
        this.estoque.put((long)this.estoque.size()+1, produto);
    }

    public void exibirProdutos(){
        System.out.println(this.estoque);
    }

    public double calcularValorTotalEstoque(){
        double valorEstoque = 0d;
        if(!this.estoque.isEmpty())
            for(Produto p : this.estoque.values()){
                valorEstoque += p.getPreco() * p.getQuantidade();
            }

        return valorEstoque;

    }

    public Produto obterProdutoMaisCaro(){
        Produto produto = null;
        double maisCaro = 0d;
        if(!this.estoque.isEmpty()){
            for(Produto p : this.estoque.values()){
                if(p.getPreco() > maisCaro){
                    maisCaro = p.getPreco();
                    produto = p;
                }
            }
        }

        return produto;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produto = null;
        double maisBarato = Double.MIN_VALUE;
        if(!this.estoque.isEmpty()){
            for(Produto p : this.estoque.values()){
                if(p.getPreco() < maisBarato){
                    maisBarato = p.getPreco();
                    produto = p;
                }
            }
        }

        return produto;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produto = null;
        double maiorTotal = Double.MIN_VALUE;
        if(!this.estoque.isEmpty()){
            for(Produto p : this.estoque.values()){
                double calcTotal = p.getPreco() * p.getQuantidade();
                if(calcTotal > maiorTotal){
                    maiorTotal = calcTotal;
                    produto = p;
                }
            }
        }

        return produto;
    }
}
