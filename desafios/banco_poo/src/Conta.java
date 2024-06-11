import exceptions.SaldoInsuficienteException;

public abstract class Conta {
    private  final int agencia = 1;
    private int numero;
    private double saldo;
    private Cliente cliente;

    private static int SEQUENCIA = 0;

    public Conta(Cliente cliente){
        this.numero = SEQUENCIA++;
        this.saldo = 0;
        this.cliente = cliente;
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if(this.saldo >= valor){
            this.saldo -= valor;
        }else{
            throw new SaldoInsuficienteException();
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) throws SaldoInsuficienteException{
        try {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } catch (SaldoInsuficienteException e) {
            throw e;
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

}
