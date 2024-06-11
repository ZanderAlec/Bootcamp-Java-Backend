public class Main {
    public static void main(String[] args) throws Exception {
        Cliente c1  = new Cliente("José Alves", "22167613032");
        Cliente c2  = new Cliente("Maria Silva", "221623213032");
        
        Conta cCorrente = new ContaCorrente(c1);
        Conta cPoupanca = new ContaPoupanca(c2);

        cCorrente.depositar(100);

        System.out.println("\n"+cCorrente.getSaldo());
        // cCorrente.sacar(100);
        cCorrente.transferir(100.00, cPoupanca);

        System.out.println(cCorrente.getSaldo());
        System.out.println(cPoupanca.getSaldo());
    }
}
