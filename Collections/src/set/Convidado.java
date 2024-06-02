public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    //Hashcode determina, quando usamos hashset, onde a instancia do objeto (qual caixa) estará armazenado.
    //como utilizamos um código personalidado, é preciso sobrescrever retornando o atributo de comparação para que todos do mesmo tipo sejam colocados juntos.
    //se não for feito, o programa permitirá instancias iguais.
    @Override
    public int hashCode() {
        return this.getCodigoConvite();
    }

    //deve ser sobrescrito para não permitir que objetos com o mesmo codigo sejam permitidos no cojunto.
    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public String toString() {
        return "Convidado{" + 
            "nome='" +  this.nome + '\'' + ", codigoConvite=" + this.codigoConvite + '}';
    }

}
