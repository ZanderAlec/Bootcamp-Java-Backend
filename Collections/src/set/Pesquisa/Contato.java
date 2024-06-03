package Pesquisa;

public class Contato {
    private String nome;
    private int numeroTelefone;

    public Contato(String nome, int numeroTelefone){
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return this.getNumeroTelefone();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Contato contato)) return false;
        return getNumeroTelefone() == contato.getNumeroTelefone();
    }


    @Override
    public String toString() {
        return "Convidado{" + 
            "nome='" +  this.nome + '\'' + ", numeroTelefone=" + this.numeroTelefone + '}';
    }


}
