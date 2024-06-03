import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos(){
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        this.produtos.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        /**
          Não é possível organizar um hashset, então é preciso guardar o resultado da ordenação em um
          TreeSet. 
        
        Como já foi especificado a prioridade da ordenação no produto, basta passar o hashset para o treeset
        que automáticamente irá fazer a identificação da ordem estabelecida e irá posicionar os elementos.
          */

       return new TreeSet<>(this.produtos);
    }

    public Set<Produto> exibirProdutosPorPreco(){
        //como não estamos utlizando o compareTo, o treeSet irá receber o comparator personalizado.
        Set<Produto> produtosPorPreco=  new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(this.produtos);
        return produtosPorPreco;
    }

    public void printProdutos(Set<Produto> produtos){

        System.out.println("---------------------------------------");
        System.out.println(produtos);
    }



    public static void main(String args[]){
        CadastroProdutos produtos = new CadastroProdutos();

            produtos.adicionarProduto(12222123, "Sabão", 18.00 , 159);
            produtos.adicionarProduto(123123123, "Amaciante", 25.90 , 200);
            produtos.adicionarProduto(23432423, "Biscoito", 5.48 , 90);
    
            produtos.printProdutos(produtos.produtos);
            produtos.printProdutos(produtos.exibirProdutosPorNome());
            produtos.printProdutos(produtos.exibirProdutosPorPreco());
    }
}
