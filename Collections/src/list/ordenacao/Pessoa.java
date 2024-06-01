public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }
    
    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Pessoa pessoa) {

        if(this.idade > pessoa.idade) return 1;
        
        if(this.idade < pessoa.idade) return -1;
        
        return 0;
    }
}
