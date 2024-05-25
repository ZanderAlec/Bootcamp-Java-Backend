package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> listaItens;

    public CarrinhoCompras(){
        this.listaItens = new ArrayList<Item>();
    }

    public void AdicionarItem(String nome, int quant, double preco){
        Item item = new Item(nome, quant, preco);
        this.listaItens.add(item);
    }

    public void removerItem(String nome){
        for(int i = 0; i < this.listaItens.size(); i++){
            final Item tempItem = this.listaItens.get(i);
            if(tempItem.getNome() == nome){
                this.listaItens.remove(i);
                break;
            }
        }
    }

    public Double calcularValorTotal(){
        
        Double total = 0.0;
        for (Item item : this.listaItens) {
            total += item.getPreco() * item.getQuantidade();
        }

        return total;
    }
    
    public void exibirItems(){
        for(Item item : this.listaItens){
            System.out.println("nome: "+ item.getNome() + " | preço: "+item.getPreco()+" | quantidade: "+item.getQuantidade());
        }

    }

    public static void main(String args[]){
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.AdicionarItem("Sabão", 1, 2.68);
        carrinho.AdicionarItem("Açúcar", 3, 4.95);
        carrinho.AdicionarItem("Café", 2, 7.69);

        carrinho.exibirItems();

        System.out.println("total: "+carrinho.calcularValorTotal());

    }


    
}
